package com.example.school.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {
    @Id
    private Long idPaiement;
    private LocalDate dateTransaction;
    private Long montant;
    @ManyToOne
    @JoinColumn(name = "eleveId")
    private Eleve eleve;

    @ManyToOne
    @JoinColumn(name = "factureId")
    private Facture facture;
}
