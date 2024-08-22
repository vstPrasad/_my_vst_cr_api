package com.vandanam.customer_requisition.controllers;

import com.vandanam.customer_requisition.dto.TalukaDto;
import com.vandanam.customer_requisition.services.TalukaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/masters")
public class TalukaController {

    @Autowired
    private TalukaService talukaService;

    @GetMapping("/taluka/{districtCode}")
    public ResponseEntity<List<TalukaDto>> getTalukasByDistrictCode(@PathVariable Integer districtCode) {
        List<TalukaDto> talukas = talukaService.getTalukasByDistrictCode(districtCode);
        return ResponseEntity.ok(talukas);
    }
}