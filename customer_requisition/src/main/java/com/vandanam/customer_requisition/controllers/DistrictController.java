package com.vandanam.customer_requisition.controllers;

import com.vandanam.customer_requisition.dto.DistrictDto;
import com.vandanam.customer_requisition.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/masters")
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping("/district/{stateCode}")
    public ResponseEntity<List<DistrictDto>> getDistrictsByStateCode(@PathVariable Integer stateCode) {
        List<DistrictDto> districts = districtService.getDistrictsByStateCode(stateCode);
        return ResponseEntity.ok(districts);
    }
}
