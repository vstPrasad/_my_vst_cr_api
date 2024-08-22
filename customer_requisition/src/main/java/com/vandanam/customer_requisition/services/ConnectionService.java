package com.vandanam.customer_requisition.services;

import com.vandanam.customer_requisition.models.ConnectionDetails;
import com.vandanam.customer_requisition.repositories.ConnectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionService {

    @Autowired
    private ConnectionRepository connectionRepository;

    public ConnectionDetails saveConnection(ConnectionDetails connectionDetails) {
        return connectionRepository.save(connectionDetails);
    }

    public ConnectionDetails getConnectionById(String id) {
        return connectionRepository.findById(id).orElse(null);
    }

    public List<ConnectionDetails> getAllConnections() {
        return connectionRepository.findAll();
    }

    public void deleteConnection(String id) {
        ConnectionDetails c=connectionRepository.findById(id).get();
        c.setIsActive(false);
        connectionRepository.save(c);

    }
}
