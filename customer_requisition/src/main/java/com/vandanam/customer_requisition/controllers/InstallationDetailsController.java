package com.vandanam.customer_requisition.controllers;

import com.vandanam.customer_requisition.models.InstallationDetails;
import com.vandanam.customer_requisition.services.InstallationDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/installations")
public class InstallationDetailsController {

    @Autowired
    private InstallationDetailsService installationDetailsService;

    @PostMapping
    public InstallationDetails createInstallationDetails(@RequestBody InstallationDetails installationDetails) {
        return installationDetailsService.saveInstallationDetails(installationDetails);
    }

    @GetMapping("/{id}")
    public InstallationDetails getInstallationDetails(@PathVariable Long id) {
        return installationDetailsService.getInstallationDetailsById(id);
    }

    @GetMapping
    public List<InstallationDetails> getAllInstallationDetails() {
        return installationDetailsService.getAllInstallationDetails();
    }

    @DeleteMapping("/{id}")
    public void deleteInstallationDetails(@PathVariable Long id) {
        installationDetailsService.deleteInstallationDetails(id);
    }
}
