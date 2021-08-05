package com.pokbab.project1.api.presentation.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pokbab.project1.api.domain.User;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {
    private String email;
    private String name;
    private Long userId;
    //    private List<ResponseOrder> orders;

    public static UserResponse with(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.email = user.getEmail();
        userResponse.name = user.getName();
        userResponse.userId = user.getId();

        return userResponse;
    }
}
