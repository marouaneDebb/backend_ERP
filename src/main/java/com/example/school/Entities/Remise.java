package com.example.school.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Remise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRemise;
    private Long pourcentage;
    private String description;

    public Remise(Service service) {
        this.service = service;
    }
    @ManyToOne
    @JoinColumn(nullable = false)
    @ToString.Exclude
    private Service service;
}
