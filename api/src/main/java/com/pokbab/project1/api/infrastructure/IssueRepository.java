package com.pokbab.project1.api.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokbab.project1.api.domain.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long> {
}
