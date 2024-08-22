package com.vandanam.customer_requisition.controllers;

import com.vandanam.customer_requisition.dto.LoginRequest;
import com.vandanam.customer_requisition.dto.LoginResponse;
import com.vandanam.customer_requisition.dto.RepresentativeDTO;
import com.vandanam.customer_requisition.services.RepresentativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public ResponseEntity<RepresentativeDTO> getRepresentative(@PathVariable String id) {
        try {
            RepresentativeDTO representative = representativeService.getRepresentativeById(id);
            if (representative != null) {
                return ResponseEntity.ok(representative);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(null);
            }
        } catch (Exception ex) {
            // You can customize the exception handling here
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An error occurred while retrieving the representative", ex);
        }
    }


    @GetMapping("/representatives")
    public ResponseEntity<List<RepresentativeDTO>> getAllRepresentatives() {
        try {
            List<RepresentativeDTO> representatives = representativeService.getAllRepresentatives();
            return ResponseEntity.ok(representatives);
        } catch (Exception ex) {
            // You can customize the exception handling here
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An error occurred while retrieving representatives", ex);
        }
    }

    @PutMapping("/representatives/{id}")
    public ResponseEntity<RepresentativeDTO> updateRepresentative(
            @PathVariable String id,
            @RequestBody RepresentativeDTO representativeDTO) {
        try {
            RepresentativeDTO updatedRepresentative = representativeService.updateRepresentative(id, representativeDTO);
            if (updatedRepresentative != null) {
                return ResponseEntity.ok(updatedRepresentative);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An error occurred while updating the representative", ex);
        }
    }

    @DeleteMapping("/representatives/{id}")
    public void deleteRepresentative(@PathVariable String id) {
        representativeService.deleteRepresentative(id);
    }
}
