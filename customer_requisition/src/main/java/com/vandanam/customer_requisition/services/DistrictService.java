package com.vandanam.customer_requisition.services;

import com.vandanam.customer_requisition.dto.DistrictDto;
import com.vandanam.customer_requisition.mappers.DistrictMapper;
import com.vandanam.customer_requisition.models.District;
import com.vandanam.customer_requisition.repositories.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    private final DistrictMapper districtMapper = DistrictMapper.INSTANCE;

    public List<DistrictDto> getDistrictsByStateCode(Integer stateCode) {
        List<District> districts = districtRepository.findByStateCode(stateCode);
        return districts.stream()
                .map(districtMapper::toDto)
                .collect(Collectors.toList());
    }
}