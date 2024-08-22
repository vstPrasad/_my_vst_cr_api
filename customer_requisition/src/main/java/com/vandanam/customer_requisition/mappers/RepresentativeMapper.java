package com.vandanam.customer_requisition.mappers;


import com.vandanam.customer_requisition.dto.RepresentativeDTO;
import com.vandanam.customer_requisition.models.Representative;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RepresentativeMapper {
    RepresentativeMapper INSTANCE = Mappers.getMapper(RepresentativeMapper.class);
    RepresentativeDTO toDto(Representative representative);
    Representative toEntity(RepresentativeDTO representativeDTO);
}
