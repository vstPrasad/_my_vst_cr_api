package com.vandanam.customer_requisition.services;

import com.vandanam.customer_requisition.dto.VillageDto;
import com.vandanam.customer_requisition.mappers.VillageMapper;
import com.vandanam.customer_requisition.models.Village;
import com.vandanam.customer_requisition.repositories.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VillageService {

    @Autowired
    private VillageRepository villageRepository;

    private final VillageMapper villageMapper = VillageMapper.INSTANCE;

    public List<VillageDto> getVillagesByTalukaCode(Integer talukaCode) {
        List<Village> villages = villageRepository.findByTalukaCode(talukaCode);
        return villages.stream()
                .map(villageMapper::toDto)
                .collect(Collectors.toList());
    }
}
