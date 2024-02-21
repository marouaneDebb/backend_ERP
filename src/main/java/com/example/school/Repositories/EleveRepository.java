package com.example.school.Repositories;

import com.example.school.Entities.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EleveRepository extends JpaRepository<Eleve,Long> {

    List<Eleve> findElevesByParentCIN(String id);
}
