package com.pokbab.project1.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

// @Getter
@Data
@Entity
@NoArgsConstructor
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column(length = 100, nullable = false)
    private String content;
    @Transient
    private String extra;

    public Issue(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Issue(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
