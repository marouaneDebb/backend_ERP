package com.example.school.Repositories;

import com.example.school.Entities.CategorieService;
import com.example.school.Entities.EtatService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtatServiceRepository extends JpaRepository<EtatService,Long> {
    public List<EtatService> findEtatServicesByPayer(boolean payer);
}
