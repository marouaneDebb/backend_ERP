package com.example.school.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class CategorieService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categorieId;
    private String nomCategorie;

    @OneToMany(mappedBy = "categorieService", fetch = FetchType.EAGER)
    @ToString.Exclude
    List<Service> services=new ArrayList<>();

}
