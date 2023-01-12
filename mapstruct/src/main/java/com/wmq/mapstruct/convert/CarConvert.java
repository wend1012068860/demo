package com.wmq.mapstruct.convert;

import com.wmq.mapstruct.beans.dto.CarDTO;
import com.wmq.mapstruct.beans.dto.DriverDTO;
import com.wmq.mapstruct.beans.dto.PartDTO;
import com.wmq.mapstruct.beans.vo.CarVO;
import com.wmq.mapstruct.beans.vo.DriverVO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * car相关pojo
 */

@Mapper
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

    @AfterMapping //表示让mapstruct在调用完自动转换的方法后再来调用本方法
    default void dtoToVoAfter(CarDTO carDTO, @MappingTarget CarVO carVO){ // @MappingTarget: 表示传来的CarVO对象是已经赋值过的
        List<PartDTO> partDTOS = carDTO.getPartDTOS();
        boolean hasPart = !CollectionUtils.isEmpty(partDTOS);
        carVO.setHasPart(hasPart);
    }
}
