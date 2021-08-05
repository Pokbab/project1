package com.pokbab.project1.api.presentation;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokbab.project1.api.presentation.model.CreateUserRequest;
import com.pokbab.project1.api.presentation.model.CreateUserResponse;
import com.pokbab.project1.api.presentation.model.UserResponse;

@RestController
@RequestMapping("/user")
public class SampleController {

    @GetMapping
    public ResponseEntity<UserResponse> getUsers() {
        // Iterable<User> users = userService.findAllUser();
        // List<UserResponse >responses = new ArrayList<>();
        // users.forEach((user)->responses.add(UserResponse.with(user)));

        return ResponseEntity.ok(new UserResponse());
    }

    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser(@RequestBody @Valid CreateUserRequest cmr) {
        // User user = userService.createUser(cmr);
        //
        // CreateUserResponse response = new CreateUserResponse(user.getName(), user.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED)
            .body(new CreateUserResponse("test", "test@test.com"));
    }

}
