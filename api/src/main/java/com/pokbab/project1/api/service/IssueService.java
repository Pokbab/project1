package com.pokbab.project1.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pokbab.project1.api.domain.Issue;
import com.pokbab.project1.api.infrastructure.IssueRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssueRepository issueRepository;

    @Transactional(readOnly = true)
    public Issue find(Long id) {
        return issueRepository.getById(id);
    }

    @Transactional(readOnly = true)
    public List<Issue> findAll() {
        return issueRepository.findAll();
    }

    @Transactional
    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }

    @Transactional
    public Issue modify(Long id, String title, String content) {
        Issue issue = issueRepository.getById(id);
        issue.setTitle(title);
        issue.setContent(content);
        return issue;
    }

    @Transactional
    public void delete(Long id) {
        issueRepository.deleteById(id);
    }

}
