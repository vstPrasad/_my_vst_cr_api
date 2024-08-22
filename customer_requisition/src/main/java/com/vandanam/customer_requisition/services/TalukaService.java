package com.vandanam.customer_requisition.services;

import com.vandanam.customer_requisition.dto.TalukaDto;
import com.vandanam.customer_requisition.mappers.TalukaMapper;
import com.vandanam.customer_requisition.models.Taluka;
import com.vandanam.customer_requisition.repositories.TalukaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TalukaService {

    @Autowired
    private TalukaRepository talukaRepository;

    private final TalukaMapper talukaMapper = TalukaMapper.INSTANCE;

    public List<TalukaDto> getTalukasByDistrictCode(Integer districtCode) {
        List<Taluka> talukas = talukaRepository.findByDistrictCode(districtCode);
        return talukas.stream()
                .map(talukaMapper::toDto)
                .collect(Collectors.toList());
    }
}
