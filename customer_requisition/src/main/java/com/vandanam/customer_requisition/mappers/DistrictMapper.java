package com.vandanam.customer_requisition.mappers;


import com.vandanam.customer_requisition.dto.DistrictDto;
import com.vandanam.customer_requisition.models.District;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DistrictMapper {
    DistrictMapper INSTANCE = Mappers.getMapper(DistrictMapper.class);

    DistrictDto toDto(District district);
    District toEntity(DistrictDto districtDto);
}