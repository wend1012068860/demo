package com.wmq.mapstruct;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-12T17:03:57+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto catToCatDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setSeatCount( car.getNumberOfSeats() );
        carDto.setMake( car.getMake() );

        carDto.setType( "type1" );

        return carDto;
    }
}
