package com.example.school.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    @Id
    private Long idFacture;
    private LocalDate dateFacturation;
    private Long montant;

    @OneToMany(mappedBy = "facture")
    List<Paiement> paiements=new ArrayList<>();
}
