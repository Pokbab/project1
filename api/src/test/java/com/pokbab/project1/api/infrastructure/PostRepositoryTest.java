package com.pokbab.project1.api.infrastructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.pokbab.project1.api.domain.Post;

@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private PostRepository postRepository;

    @Test
    public void save() {
        // Given
        // Post post = Post.builder()
        //     .title("test")
        //     .body("body")
        //     .build();
        Post post = new Post();
        post.setTitle("test");
        post.setBody("body");

        // When
        postRepository.save(post);
        this.flushAndClear();

        // Then
        Post actual = testEntityManager.find(Post.class, post.getId());
        assertEquals(actual.getTitle(), post.getTitle());
        assertEquals(actual.getBody(), post.getBody());
    }

    private void flushAndClear() {
        testEntityManager.flush();
        testEntityManager.clear();
    }

}
