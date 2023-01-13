package com.wmq.mapstruct.convert;

import com.wmq.mapstruct.beans.dto.CarDTO;
import com.wmq.mapstruct.beans.dto.DriverDTO;
import com.wmq.mapstruct.beans.dto.PartDTO;
import com.wmq.mapstruct.beans.vo.CarVO;
import com.wmq.mapstruct.beans.vo.DriverVO;
import com.wmq.mapstruct.beans.vo.VehicleVO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * car相关pojo
 */

@Mapper(componentModel = "spring")
public interface CarConvert {
    CarConvert instance = Mappers.getMapper(CarConvert.class);

    @Mappings({
            @Mapping(source = "totalPrice", target = "totalPrice", numberFormat = "#.00"),
            @Mapping(source = "publishDate", target = "publishDate", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(target = "price", ignore = true),
            @Mapping(source = "driverDTO", target = "driverVO")
    })
    CarVO carDTOToCarVO(CarDTO carDTO);

    @Mapping(source = "id", target = "driverId")
    @Mapping(source = "name", target = "fullName")
    DriverVO driverDTOToDriverVO(DriverDTO driverDTO);

    @AfterMapping //再映射最后一步对属性进行自定义映射处理
    default void dtoToVoAfter(CarDTO carDTO, @MappingTarget CarVO carVO){ // @MappingTarget: 对已经映射过的CarVO进行赋值
        List<PartDTO> partDTOS = carDTO.getPartDTOS();
        boolean hasPart = !CollectionUtils.isEmpty(partDTOS);
        carVO.setHasPart(hasPart);
    }

    /**
     * carDTOToCarVO 批量映射
     */
    List<CarVO> carDTOsToCarVOs(List<CarDTO> carDTOs);

    /**
     * 忽略mapstruct的默认映射行为，只映射配置了@Mapping的属性
     * @param carDTO
     * @return
     */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "brand", target = "brandName")
    VehicleVO carDTOToVehicleVO(CarDTO carDTO);

    /**
     * @InheritConfiguration避免同样的配置重复编写
     * @param carDTO
     * @param vehicleVO
     */
    @InheritConfiguration
    void updateVehicleVO(CarDTO carDTO, @MappingTarget VehicleVO vehicleVO);

    /**
     * @InheritInverseConfiguration反向映射
     * name:需要反向映射的方法名
     * @param vehicleVO
     * @return
     */
    @InheritInverseConfiguration(name = "carDTOToVehicleVO")
    CarDTO vehicleVOToCarDTO(VehicleVO vehicleVO);

}
