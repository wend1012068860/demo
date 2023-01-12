package com.wmq.mapstruct;


import org.junit.jupiter.api.Test;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/12
 * @description:
 */

public class MapstructTest {

    @Test
    public void t1(){
        CarMapper carMapper = CarMapper.instance;
        Car car = new Car();
        car.setMake("wmq");
        car.setNumberOfSeats(5);
        CarDto carDto = carMapper.catToCatDto(car);
        System.out.println(carDto);
    }

}
