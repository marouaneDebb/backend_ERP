package com.example.school.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate start;
    private String description;
    private String pereodicity;
    private double price;
    private ServiceType type;

    @ManyToOne
    @JoinColumn(name = "id_remise")
    private Remise remise;

//    @ManyToMany(fetch = FetchType.EAGER)
//            @JoinTable(joinColumns = @JoinColumn(name = "service"),
//                    inverseJoinColumns =@JoinColumn(name ="eleve") )
//    @ToString.Exclude
//    List<Eleve> eleves=new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private CategorieService categorieService;

    @OneToMany(mappedBy = "service",fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<EtatService> etatServices = new ArrayList<>();


    public Service(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
}
