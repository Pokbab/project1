package com.pokbab.project1.api.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokbab.project1.api.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
