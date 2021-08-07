package com.pokbab.project1.api.presentation.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CreateUserRequest {

    @NotNull(message="Email can not be null")
    @Email
    private String email;

    @NotNull(message = "Password can not be null")
    @Size(min=6, message= "Password must be at least six characters long.")
    private String pwd;

    @NotNull(message = "Name can not be null")
    @Size(min=2, message = "Name must be at least six characters long.")
    private String name;

    private LocalDateTime createdAt;

}
