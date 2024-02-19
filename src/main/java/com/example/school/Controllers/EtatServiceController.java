package com.example.school.Controllers;

import com.example.school.Entities.Eleve;
import com.example.school.Entities.EtatService;
import com.example.school.Repositories.EleveRepository;
import com.example.school.Repositories.EtatServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/etat-service")
public class EtatServiceController {

    @Autowired
    private EtatServiceRepository etatServiceRepository;
    @GetMapping("/all")
    public List<EtatService> getEtatServices(){
        return etatServiceRepository.findAll();
    }

//    @GetMapping("/studentNoPayed")
//    public List<Eleve>
    @GetMapping("/{eleveId}")
    public Optional<EtatService> getEtatServiceById(@PathVariable Long eleveId){
        return etatServiceRepository.findById(eleveId);
    }

    @PostMapping("/add")
    public EtatService addEleve(@RequestBody EtatService etatService ){
              return etatServiceRepository.save(etatService);
    }

//    @PutMapping("/etatServiceId")
//    public void updateEleve(@RequestBody EtatService etatService, @PathVariable Long etatServiceId){
//        etatServiceRepository.findById(etatServiceId).map(eleve1 -> {
//            return etatServiceRepository.save(eleve1);
//        });
//    }

    @DeleteMapping("/eleveId")
    public void deleteEtatService(@PathVariable Long eleveId){
        etatServiceRepository.deleteById(eleveId);
    }

}
