package com.vandanam.customer_requisition.services;

import com.vandanam.customer_requisition.models.InstallationDetails;
import com.vandanam.customer_requisition.repositories.InstallationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstallationDetailsService {

    @Autowired
    private InstallationDetailsRepository installationDetailsRepository;

    public InstallationDetails saveInstallationDetails(InstallationDetails installationDetails) {
        return installationDetailsRepository.save(installationDetails);
    }

    public InstallationDetails getInstallationDetailsById(Long id) {
        return installationDetailsRepository.findById(id).orElse(null);
    }

    public List<InstallationDetails> getAllInstallationDetails() {
        return installationDetailsRepository.findAll();
    }

    public void deleteInstallationDetails(Long id) {
        InstallationDetails i=installationDetailsRepository.findById(id).get();
        i.setIsActive(false);
        installationDetailsRepository.save(i);
    }
}