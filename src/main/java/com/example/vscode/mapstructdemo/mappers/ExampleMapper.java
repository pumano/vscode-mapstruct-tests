package com.example.vscode.mapstructdemo.mappers;

import com.example.vscode.mapstructdemo.domain.Source;
import com.example.vscode.mapstructdemo.domain.Target;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExampleMapper {
 
    ExampleMapper INSTANCE = Mappers.getMapper( ExampleMapper.class );
 
    // @Mapping(source = "numberOfSeats", target = "seatCount")
    Target dtoToDomain(Source dto);
}