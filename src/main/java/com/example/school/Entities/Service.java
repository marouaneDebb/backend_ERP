package com.example.school.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    @Id
    private Long idService;

    @OneToMany
    List<Remise> remises=new ArrayList<>();

    @ManyToMany
            @JoinTable(joinColumns = @JoinColumn(name = "service"),
                    inverseJoinColumns =@JoinColumn(name ="eleve") )
    List<Eleve> eleves=new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "categorieServieId")
    private CategorieService categorieService;
}
