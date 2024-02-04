package com.example.school.Entities;


import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    List<Service> services=new ArrayList<>();

}
