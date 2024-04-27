package com.example.JavaAssignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String title;
    @JoinColumn
    @ManyToOne
    private Author author;
    @Column(unique = true, nullable = false)
    private String isbn;
    @Column(nullable = false)
    private int publicationYear;
    private boolean isAvailable;
}

