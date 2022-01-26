package com.pokbab.project1.api.infrastructure;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.pokbab.project1.api.domain.Issue;

@DataJpaTest
public class IssueRepositoryTest {

    @Autowired
    private IssueRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void save() {
        Issue issue = new Issue("title", "content");
        repository.save(issue);

        entityManager.clear();

        Issue loadedIssue = repository.getById(issue.getId());

        Assertions.assertEquals("title", loadedIssue.getTitle());
        Assertions.assertEquals("content", loadedIssue.getContent());
    }

}
