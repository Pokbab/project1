package com.pokbab.project1.api.presentation.model;

import lombok.Data;

@Data
public class CreateUserResponse {

    private String name;
    private String email;

    public CreateUserResponse(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
