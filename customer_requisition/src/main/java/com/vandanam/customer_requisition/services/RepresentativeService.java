package com.vandanam.customer_requisition.services;

import com.vandanam.customer_requisition.dto.LoginRequest;
import com.vandanam.customer_requisition.dto.LoginResponse;
import com.vandanam.customer_requisition.dto.RepresentativeDTO;
import com.vandanam.customer_requisition.mappers.RepresentativeMapper;
import com.vandanam.customer_requisition.models.Representative;
import com.vandanam.customer_requisition.repositories.RepresentativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RepresentativeService {

    @Autowired
    private RepresentativeRepository representativeRepository;

    @Autowired
    private RepresentativeMapper representativeMapper;

    public RepresentativeDTO saveRepresentative(RepresentativeDTO representativeDTO) {
        Representative representative = representativeMapper.toEntity(representativeDTO);
        Representative savedRepresentative = representativeRepository.save(representative);
        return representativeMapper.toDto(savedRepresentative);
    }

    public RepresentativeDTO getRepresentativeById(String id) {
        Representative representative = representativeRepository.findById(id).orElse(null);
        return representativeMapper.toDto(representative);
    }

    public List<RepresentativeDTO> getAllRepresentatives() {
        return representativeRepository.findAll().stream()
                .map(representativeMapper::toDto)
                .collect(Collectors.toList());
    }

    public void deleteRepresentative(String id) {
        Representative r = representativeRepository.findById(id).orElse(null);
        if (r != null) {
            r.setIsActive(false);
            representativeRepository.save(r);
        }
    }

    public RepresentativeDTO updateRepresentative(String id, RepresentativeDTO representativeDTO) {
        // Fetch the existing representative
        Representative existingRepresentative = representativeRepository.findById(id).orElse(null);
        if (existingRepresentative != null) {
            // Update fields
            existingRepresentative.setName(representativeDTO.getName());
            existingRepresentative.setMobile(representativeDTO.getMobile());
            existingRepresentative.setEmail(representativeDTO.getEmail());
            existingRepresentative.setPassword(representativeDTO.getPassword());
            existingRepresentative.setAddressPlaceId(representativeDTO.getAddressPlaceId());
            existingRepresentative.setPlaceType(representativeDTO.getPlaceType());
            existingRepresentative.setPlaceNumber(representativeDTO.getPlaceNumber());
            existingRepresentative.setEducationalCredits(representativeDTO.getEducationalCredits());
            existingRepresentative.setDob(representativeDTO.getDob());
            existingRepresentative.setYearsOfExperience(representativeDTO.getYearsOfExperience());
            existingRepresentative.setIsActive(representativeDTO.getIsActive());

            // Save the updated representative
            Representative updatedRepresentative = representativeRepository.save(existingRepresentative);
            return representativeMapper.toDto(updatedRepresentative);
        } else {
            return null; // or throw an exception if preferred
        }
    }

    public LoginResponse authenticateRepresentative(LoginRequest loginRequest) {
        Representative representative = representativeRepository.findByEmail(loginRequest.getUsername());
        if (representative != null && representative.getPassword().equals(loginRequest.getPassword()) && representative.getIsActive()) {
            RepresentativeDTO representativeDTO = representativeMapper.toDto(representative);
            return new LoginResponse(200, "Login success", representativeDTO);
        } else {
            return null;
        }
    }
}
