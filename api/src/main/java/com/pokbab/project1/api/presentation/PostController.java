package com.pokbab.project1.api.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokbab.project1.api.infrastructure.PostRepository;
import com.pokbab.project1.api.presentation.model.UserResponse;
import com.pokbab.project1.api.presentation.model.post.PostsResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    // private final PostRepository postRepository;
    //
    // @GetMapping
    // public ResponseEntity<PostsResponse> getAllPost() {
    //     return ResponseEntity.ok(new PostsResponse(postRepository.findAll()));
    // }
    //
    // @GetMapping("/{id}")
    // public ResponseEntity<UserResponse> getPost() {
    //     return ResponseEntity.ok(new UserResponse());
    // }
    //
    // @PostMapping
    // public ResponseEntity<UserResponse> createPost() {
    //     return ResponseEntity.ok(new UserResponse());
    // }
    //
    // @PutMapping("/{id}")
    // public ResponseEntity<UserResponse> modifyPost() {
    //     return ResponseEntity.ok(new UserResponse());
    // }
    //
    // @DeleteMapping("/{id}")
    // public ResponseEntity<UserResponse> removePost() {
    //     return ResponseEntity.ok(new UserResponse());
    // }

}
