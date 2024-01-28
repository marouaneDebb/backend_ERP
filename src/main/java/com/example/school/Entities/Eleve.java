package com.example.school.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private Date dateNaissance;

    public Eleve(Parent parent){
        this.parent =parent;
    }

    @ManyToOne
    @JoinColumn(name = "parentCIN",nullable = false)
    @ToString.Exclude
    private Parent parent;

    @OneToMany(mappedBy = "eleve",fetch = FetchType.EAGER)
    List<Paiement> paiements=new ArrayList<>();

    @ManyToMany(mappedBy = "eleves", fetch = FetchType.EAGER)
    List<Service> services=new ArrayList<>();
}
