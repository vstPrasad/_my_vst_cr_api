package com.vandanam.customer_requisition.mappers;


import com.vandanam.customer_requisition.dto.TalukaDto;
import com.vandanam.customer_requisition.models.Taluka;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TalukaMapper{
    TalukaMapper INSTANCE = Mappers.getMapper(TalukaMapper.class);

    TalukaDto toDto(Taluka taluka);
    Taluka toEntity(TalukaDto talukaDto);
}
