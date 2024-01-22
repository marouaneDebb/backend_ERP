package com.example.school.Controllers;

<<<<<<< HEAD
import com.example.school.Entities.Facture;
import com.example.school.Entities.Remise;
import com.example.school.Repositories.FactureRepository;
import com.example.school.Repositories.RemiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589

@RestController
@RequestMapping("/facture")
public class FactureController {
<<<<<<< HEAD
    @Autowired
    private FactureRepository factureRepository;
    @GetMapping
    public List<Facture> getFactures(){
        return factureRepository.findAll();
    }

    @GetMapping("/{factureId}")
    public Optional<Facture> getFactureById(@PathVariable Long factureId){
        return factureRepository.findById(factureId);
    }

    @PostMapping
    public Facture addFacture(@RequestBody Facture facture){
        return factureRepository.save(facture);
    }

    @PutMapping("/factureId")
    public void updateFacture(@RequestBody Facture facture, @PathVariable Long factureId){
        factureRepository.findById(factureId).map(facture1 -> {

            return factureRepository.save(facture1);
        });
    }

    @DeleteMapping("/factureId")
    public void deleteFacture(@PathVariable Long factureId){
        factureRepository.deleteById(factureId);
    }
=======
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589
}
