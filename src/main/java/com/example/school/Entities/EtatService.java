package com.example.school.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class EtatService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateInscription = LocalDate.now();
    @Column(nullable = false)
    private boolean payer;

    @ManyToOne
    @JoinColumn(nullable = false)
    @ToString.Exclude
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Service service;

    @ManyToOne
    @JoinColumn(nullable = false)
    @ToString.Exclude
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Eleve eleve;
}
