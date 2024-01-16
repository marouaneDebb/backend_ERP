package com.example.school.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Eleve {
    @Id
    private Long idEleve;

    @ManyToOne
    @JoinColumn(name = "parentCIN",nullable = false)
    private Parent parent;

    @OneToMany(mappedBy = "eleve",fetch = FetchType.EAGER)
    List<Paiement> paiements=new ArrayList<>();

    @ManyToMany(mappedBy = "eleves", fetch = FetchType.EAGER)
    List<Service> services=new ArrayList<>();
}
