package com.pokbab.project1.api.presentation.model.post;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class PostsResponse {

    private List<Post> posts;

    public PostsResponse(List<com.pokbab.project1.api.domain.Post> posts) {
        this.posts = posts.stream()
            .map(post -> new Post(post.getTitle(), post.getBody()))
            .collect(Collectors.toList());
    }

    @Getter
    @AllArgsConstructor
    public static class Post {

        private String title;
        private String body;

    }

}
