package com.wmq.mapstruct;


import com.wmq.mapstruct.beans.dto.CarDTO;
import com.wmq.mapstruct.beans.dto.DriverDTO;
import com.wmq.mapstruct.beans.dto.PartDTO;
import com.wmq.mapstruct.beans.vo.CarVO;
import com.wmq.mapstruct.convert.CarConvert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/12
 * @description:
 */

public class MapstructTest {

    @Test
    public void test1(){
        CarDTO carDTO = buildCarDTO();
        CarVO carVO = CarConvert.instance.carDTOToCarVO(carDTO);
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
