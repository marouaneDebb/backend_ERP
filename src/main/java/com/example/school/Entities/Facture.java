package com.example.school.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    private LocalDate dateFacturation;
    private double montant;
    @ToString.Exclude
    @OneToMany(mappedBy = "facture",fetch = FetchType.EAGER)
    List<Paiement> paiements=new ArrayList<>();
}
