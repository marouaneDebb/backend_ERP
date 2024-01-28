package com.example.school.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eleve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEleve;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;

    public Eleve(Parent parent){
        this.parent =parent;
    }
    private LocalDate dateNaissance;

    @ManyToOne
    @JoinColumn(name = "parentCIN",nullable = false)
    @ToString.Exclude
    private Parent parent;

    @OneToMany(mappedBy = "eleve",fetch = FetchType.EAGER)
    List<Paiement> paiements=new ArrayList<>();

    @ManyToMany(mappedBy = "eleves", fetch = FetchType.EAGER)
    List<Service> services=new ArrayList<>();
}
