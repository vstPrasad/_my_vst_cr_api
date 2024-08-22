package com.vandanam.customer_requisition.controllers;

import com.vandanam.customer_requisition.dto.LoginRequest;
import com.vandanam.customer_requisition.dto.LoginResponse;
import com.vandanam.customer_requisition.dto.RepresentativeDTO;
import com.vandanam.customer_requisition.services.RepresentativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RepresentativeController {

    @Autowired
    private RepresentativeService representativeService;

    @PostMapping("/user-auth/signin")
    public ResponseEntity<LoginResponse> loginRepresentative(@RequestBody LoginRequest loginRequest) {
        LoginResponse response = representativeService.authenticateRepresentative(loginRequest);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body(new LoginResponse(401, "Invalid credentials", null));
        }
    }

    @PostMapping("/representatives")
    public RepresentativeDTO createRepresentative(@RequestBody RepresentativeDTO representativeDTO) {
        return representativeService.saveRepresentative(representativeDTO);
    }

    @GetMapping("/representatives/{id}")
    public RepresentativeDTO getRepresentative(@PathVariable String id) {
        return representativeService.getRepresentativeById(id);
    }

    @GetMapping("/representatives")
    public List<RepresentativeDTO> getAllRepresentatives() {
        return representativeService.getAllRepresentatives();
    }

    @DeleteMapping("/representatives/{id}")
    public void deleteRepresentative(@PathVariable String id) {
        representativeService.deleteRepresentative(id);
    }
}
