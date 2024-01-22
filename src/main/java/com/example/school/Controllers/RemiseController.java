package com.example.school.Controllers;

<<<<<<< HEAD
import com.example.school.Entities.Parent;
import com.example.school.Entities.Remise;
import com.example.school.Repositories.ParentRepository;
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
@RequestMapping("/remise")
public class RemiseController {
<<<<<<< HEAD
    @Autowired
    private RemiseRepository remiseRepository;
    @GetMapping
    public List<Remise> getRemises(){
        return remiseRepository.findAll();
    }

    @GetMapping("/{remiseId}")
    public Optional<Remise> getRemiseById(@PathVariable Long remiseId){
        return remiseRepository.findById(remiseId);
    }

    @PostMapping
    public Remise addRemise(@RequestBody Remise remise){
        return remiseRepository.save(remise);
    }

    @PutMapping("/remiseId")
    public void updateRemise(@RequestBody Remise remise, @PathVariable Long remiseId){
        remiseRepository.findById(remiseId).map(remise1 -> {

            return remiseRepository.save(remise1);
        });
    }

    @DeleteMapping("/remiseId")
    public void deleteRemise(@PathVariable Long remiseId){
        remiseRepository.deleteById(remiseId);
    }
}


=======
}
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589
