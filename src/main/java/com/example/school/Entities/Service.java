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
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    private double montant;
    public Service(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
    private String nomService;
    private String periodicite;

    @OneToMany(mappedBy="service" ,fetch= FetchType.EAGER)
    List<Discount> discounts =new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
            @JoinTable(joinColumns = @JoinColumn(name = "service"),
                    inverseJoinColumns =@JoinColumn(name ="eleve") )
    @ToString.Exclude
    List<Eleve> eleves=new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "categorieServieId",nullable = false)
    private CategorieService categorieService;
}
