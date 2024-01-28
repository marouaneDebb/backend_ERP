package com.example.school.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class CategorieService {
    @Id
    private Long categorieId;
    private String nomCategorie;

    @OneToMany(mappedBy = "categorieService")
    List<Service> services=new ArrayList<>();

}
