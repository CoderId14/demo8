package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;


@Table(name = "book")
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
}
