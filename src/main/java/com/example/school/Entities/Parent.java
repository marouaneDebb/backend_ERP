package com.example.school.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Parent {
    @Id
    private String cinParent;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    private String email;
    private String phoneNumber;
    private String adress;

    @OneToMany(mappedBy = "parent" ,fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    List<Eleve> eleves =new ArrayList<>();
}
