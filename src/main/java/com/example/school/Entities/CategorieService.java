package com.example.school.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CategorieService {
    @Id
    private Long categorieId;
    private String nomCategorie;

    @OneToMany(mappedBy = "categorieService")
    List<Service> services=new ArrayList<>();

}
