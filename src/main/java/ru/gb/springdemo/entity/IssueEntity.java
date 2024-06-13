package ru.gb.springdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * Класс, описывающий факт выдачи книги для работы с базой данных
 */

@Entity
@Table(name = "issues")
@Data
@AllArgsConstructor
public class IssueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "reader_id", nullable = false)
    private Long readerId;

    @Column(name = "issued_at", nullable = false)
    private LocalDate issuedAt;

    @Column(name = "returned_at")
    private LocalDate returnedAt;

}