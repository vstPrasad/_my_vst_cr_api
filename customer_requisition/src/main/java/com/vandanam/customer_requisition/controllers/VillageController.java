package com.vandanam.customer_requisition.controllers;

import com.vandanam.customer_requisition.dto.VillageDto;
import com.vandanam.customer_requisition.services.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/masters")
public class VillageController {

    @Autowired
    private VillageService villageService;

    @GetMapping("/village/{talukaCode}")
    public ResponseEntity<List<VillageDto>> getVillagesByTalukaCode(@PathVariable Integer talukaCode) {
        List<VillageDto> villages = villageService.getVillagesByTalukaCode(talukaCode);
        return ResponseEntity.ok(villages);
    }
}