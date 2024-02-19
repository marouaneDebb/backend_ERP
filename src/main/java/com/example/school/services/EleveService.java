package com.example.school.services;

import com.example.school.Entities.Eleve;
import com.example.school.Repositories.EleveRepository;
import com.example.school.Repositories.EtatServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class EleveService {
    private EleveRepository eleveRepository;
    private EtatServiceRepository etatServiceRepository;

    public Map<Eleve, Double> elevesSansPayer(){
        Map<Eleve, Double> elevesSP = new HashMap<>();

//        List<Eleve>  = new ArrayList<>();
        etatServiceRepository.findEtatServicesByPayer(false).forEach((p) -> {
            elevesSP.put(p.getEleve(),p.getService().getPrice());
        });
        return elevesSP;
    }

}
