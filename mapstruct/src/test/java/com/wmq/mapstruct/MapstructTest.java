package com.wmq.mapstruct;


import com.wmq.mapstruct.beans.dto.CarDTO;
import com.wmq.mapstruct.beans.dto.DriverDTO;
import com.wmq.mapstruct.beans.dto.PartDTO;
import com.wmq.mapstruct.beans.vo.CarVO;
import com.wmq.mapstruct.beans.vo.VehicleVO;
import com.wmq.mapstruct.convert.CarConvert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/12
 * @description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MapstructApplication.class)
public class MapstructTest {

    @Autowired
    private CarConvert carConvert;

    /**
     * CarDTO -> CarVO
     */
    @Test
    public void test1(){
        CarDTO carDTO = buildCarDTO();
        CarVO carVO = CarConvert.instance.carDTOToCarVO(carDTO);
        System.out.println(carVO);
    }

    /**
     * List<CarDTO> -> List<CarVO>
     */
    @Test
    public void test2(){
        CarDTO carDTO = buildCarDTO();
        List<CarDTO> carDTOList = new ArrayList<>();
        carDTOList.add(carDTO);
        List<CarVO> carVOList = CarConvert.instance.carDTOsToCarVOs(carDTOList);
        System.out.println(carVOList);
    }

    /**
     * 测试@BeanMapping
     */
    @Test
    public void test3(){
        CarDTO carDTO = buildCarDTO();
        VehicleVO vehicleVO = CarConvert.instance.carDTOToVehicleVO(carDTO);
        System.out.println(vehicleVO);
    }

    /**
     * 测试@InheritConfiguration继承配置
     */
    @Test
    public void test4(){
        CarDTO carDTO = buildCarDTO();
        VehicleVO vehicleVO = CarConvert.instance.carDTOToVehicleVO(carDTO);

        CarDTO carDTO2 = new CarDTO();
        carDTO2.setId(2L);
        carDTO2.setBrand("奔驰");
        CarConvert.instance.updateVehicleVO(carDTO2, vehicleVO);
        System.out.println(vehicleVO);
    }

    /**
     * 测试@InheritInverseConfiguration反向继承
     * @return
     */
    @Test
    public void test5(){
        VehicleVO vehicleVO = new VehicleVO();
        vehicleVO.setId(3L);
        vehicleVO.setBrandName("保时捷");
        vehicleVO.setPrice(660000.23d);
        CarDTO carDTO = CarConvert.instance.vehicleVOToCarDTO(vehicleVO);
        System.out.println(carDTO);
    }

    /**
     * 测试spring结合使用
     * @return
     */
    @Test
    public void test6(){
        CarDTO carDTO = buildCarDTO();
        CarVO carVO = carConvert.carDTOToCarVO(carDTO);
        System.out.println(carVO);
    }

    private CarDTO buildCarDTO(){
        CarDTO carDTO = new CarDTO();
        carDTO.setId(1L);
        carDTO.setVin("vin000001");
        carDTO.setPrice(332345.673d);
        carDTO.setTotalPrice(352345.673d);
        carDTO.setPublishDate(new Date());
        carDTO.setBrand("宝马");

        PartDTO partDTO1 = new PartDTO();
        partDTO1.setId(1L);
        partDTO1.setPartName("多工能方向盘");
        PartDTO partDTO2 = new PartDTO();
        partDTO2.setId(2L);
        partDTO2.setPartName("智能车门");

        List<PartDTO> partDTOList = new ArrayList<>();
        partDTOList.add(partDTO1);
        partDTOList.add(partDTO2);
        carDTO.setPartDTOS(partDTOList);

        DriverDTO driverDTO = new DriverDTO();
        driverDTO.setId(1L);
        driverDTO.setName("张三");
        carDTO.setDriverDTO(driverDTO);
        return carDTO;
    }

}
