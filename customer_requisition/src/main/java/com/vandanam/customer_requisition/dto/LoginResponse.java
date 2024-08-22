package com.vandanam.customer_requisition.dto;

import lombok.Data;
import com.vandanam.customer_requisition.models.Representative;

@Data
public class LoginResponse {
    private int code;
    private String message;
    private RepresentativeDTO userData;

    public LoginResponse(int code, String message, RepresentativeDTO userData) {
        this.code = code;
        this.message = message;
        this.userData = userData;
    }
}
