package com.vandanam.customer_requisition.controllers;

import com.vandanam.customer_requisition.models.ConnectionDetails;
import com.vandanam.customer_requisition.services.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/connections")
public class ConnectionController {

    @Autowired
    private ConnectionService connectionService;

    @PostMapping
    public ConnectionDetails createConnection(@RequestBody ConnectionDetails connectionDetails) {
        return connectionService.saveConnection(connectionDetails);
    }

    @GetMapping("/{id}")
    public ConnectionDetails getConnection(@PathVariable String id) {
        return connectionService.getConnectionById(id);
    }

    @GetMapping
    public List<ConnectionDetails> getAllConnections() {
        return connectionService.getAllConnections();
    }

    @DeleteMapping("/{id}")
    public void deleteConnection(@PathVariable String id) {
        connectionService.deleteConnection(id);
    }
}
