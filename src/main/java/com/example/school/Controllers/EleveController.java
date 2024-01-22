package com.example.school.Controllers;

<<<<<<< HEAD
import com.example.school.Entities.Eleve;
import com.example.school.Repositories.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589

@RestController
@RequestMapping("/eleve")
public class EleveController {
<<<<<<< HEAD
    @Autowired
    private EleveRepository eleveRepository;
    @GetMapping
    public List<Eleve> getEleves(){
        return eleveRepository.findAll();
    }

    @GetMapping("/{eleveId}")
    public Optional<Eleve> getEleveById(@PathVariable Long eleveId){
        return eleveRepository.findById(eleveId);
    }

    @PostMapping
    public Eleve addEleve(@RequestBody Eleve eleve){
        return eleveRepository.save(eleve);
    }

    @PutMapping("/eleveId")
    public void updateEleve(@RequestBody Eleve eleve, @PathVariable Long eleveId){
        eleveRepository.findById(eleveId).map(eleve1 -> {

            return eleveRepository.save(eleve1);
        });
    }

    @DeleteMapping("/eleveId")
    public void deleteEleve(@PathVariable Long eleveId){
        eleveRepository.deleteById(eleveId);
    }

=======
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589
}
