package com.wmq.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @authoer:WangMengqiang
 * @createDate:2023/1/12
 * @description:
 */
@Mapper
public interface CarMapper {

    CarMapper instance = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
//    @Mapping(target = "type", expression = "java(car.getMake())") // 需安装mapstruct support 插件
    @Mapping(target = "type", constant = "type1")
    CarDto catToCatDto(Car car);
}
