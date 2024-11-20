package com.example.springjpql.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "cource")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
