package com.example.school.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {
    @Id
    private Long cinParent;
    private String nom;
    private String prenom;
    private String email;
    private String phoneNumber;
    private String adress;

    @OneToMany(mappedBy = "parent")
    List<Eleve> eleves =new ArrayList<>();
}
