package com.example.school.services;

import com.example.school.Entities.Eleve;
import com.example.school.Entities.Parent;
import com.example.school.Repositories.ParentRepository;
import org.hibernate.mapping.Any;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaiementService {

    ParentService parentService;
    EleveService eleveService;
//    public void getPaimentParent(String id) {
//        List<Any> anies = new ArrayList<>();
//        Parent parent = parentService.getParentById(id);
//        List<Eleve> eleves = eleveService.getElevesByParentId(id);
//        eleves.forEach(p->{
//            anies.add([p.getFirstName(),p.getEtatServices()]);
//        });
//
//    }
}
