package com.pokbab.project1.api.domain;

import lombok.Getter;

@Getter
public class User {

    private long id;
    private String email;
    private String name;
    private String encryptedPwd;

}
