package com.example.school.Controllers;

<<<<<<< HEAD
import com.example.school.Entities.Paiement;
import com.example.school.Entities.Parent;
import com.example.school.Repositories.PaiementRepository;
import com.example.school.Repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589

@RestController
@RequestMapping("/paiement")
public class PaiementController {
<<<<<<< HEAD
    @Autowired
    private PaiementRepository paiementRepository;
    @GetMapping
    public List<Paiement> getPaiements(){
        return paiementRepository.findAll();
    }

    @GetMapping("/{paiementId}")
    public Optional<Paiement> getPaiementById(@PathVariable Long paiementId){
        return paiementRepository.findById(paiementId);
    }

    @PostMapping
    public Paiement addPaiement(@RequestBody Paiement paiement){
        return paiementRepository.save(paiement);
    }

    @PutMapping("/paiementId")
    public void updatePaiement(@RequestBody Paiement paiement, @PathVariable Long paiementId){
        paiementRepository.findById(paiementId).map(paiement1 -> {

            return paiementRepository.save(paiement1);
        });
    }

    @DeleteMapping("/paiementId")
    public void deletePaiement(@PathVariable Long paiementId){
        paiementRepository.deleteById(paiementId);
    }
=======
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589
}
