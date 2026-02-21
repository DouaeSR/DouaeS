package com.bookstore.douaes.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email; // ou email si tu veux
    private String password;
}