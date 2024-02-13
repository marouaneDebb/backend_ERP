package com.example.school.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Remise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiscount;
    @Column(nullable = false)
    private String nameDiscount;
    private String description;
    private String conditionn;
    private LocalDate dateValidation;
    @Column(nullable = false)
    @DecimalMin(value = "0.0000000001", inclusive = false)
    private double percentage;

    public Remise(Service service) {
        this.service = service;
    }
    @ManyToOne
//    @JoinColumn(nullable = false)
    @ToString.Exclude
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Service service;
}
