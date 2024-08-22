package com.vandanam.customer_requisition.mappers;


import com.vandanam.customer_requisition.dto.VillageDto;
import com.vandanam.customer_requisition.models.Village;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VillageMapper {
    VillageMapper INSTANCE = Mappers.getMapper(VillageMapper.class);

    VillageDto toDto(Village village);
    Village toEntity(VillageDto villageDto);
}