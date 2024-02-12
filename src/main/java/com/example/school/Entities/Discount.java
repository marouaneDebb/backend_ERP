package com.example.school.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiscount;
    private String nameDiscount;
    private String description;
    private String conditionn;
    private LocalDate dateValidation;
    private double percentage;

    public Discount(Service service) {
        this.service = service;
    }
    @ManyToOne
    @JoinColumn(nullable = false)
    @ToString.Exclude
    private Service service;
}
