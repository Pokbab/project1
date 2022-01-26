package com.pokbab.project1.api.presentation;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokbab.project1.api.domain.Issue;
import com.pokbab.project1.api.service.IssueService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/issues")
@RequiredArgsConstructor
public final class IssueController {

    private final IssueService issueService;

    @PostMapping
    public ResponseEntity<Issue> saveIssue(@RequestBody Issue issueForm) {
        Issue issue = issueService.save(issueForm);
        return new ResponseEntity<>(issue, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Issue> findIssue(@PathVariable Long id) {
        Issue issue = issueService.find(id);
        return new ResponseEntity<>(issue, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Issue> issues = issueService.findAll();
        return new ResponseEntity<>(issues, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Issue> modifyIssue(@PathVariable Long id, @RequestBody Issue issueForm) {
        Issue issue = issueService.modify(id, issueForm.getTitle(), issueForm.getContent());
        return new ResponseEntity<>(issue, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> saveIssue(@PathVariable Long id) {
        issueService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
