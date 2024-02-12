package com.example.school.Controllers;

import com.example.school.Entities.Discount;
import com.example.school.Repositories.RemiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remise")
public class RemiseController {
    @Autowired
    private RemiseRepository remiseRepository;
    @GetMapping
    public List<Discount> getRemises(){
        return remiseRepository.findAll();
    }

    @GetMapping("/{remiseId}")
    public Optional<Discount> getRemiseById(@PathVariable Long remiseId){
        return remiseRepository.findById(remiseId);
    }

    @PostMapping
    public Discount addRemise(@RequestBody Discount discount){
        return remiseRepository.save(discount);
    }

    @PutMapping("/remiseId")
    public void updateRemise(@RequestBody Discount discount, @PathVariable Long remiseId){
        remiseRepository.findById(remiseId).map(remise1 -> {
            remise1.setNameDiscount(discount.getNameDiscount());
            remise1.setDescription(discount.getDescription());
//            remise1.setCondition(discount.getCondition());
//            remise1.setDateValidation(discount.getDateValidation());
            return remiseRepository.save(remise1);
        });
    }

    @DeleteMapping("/remiseId")
    public void deleteRemise(@PathVariable Long remiseId){
        remiseRepository.deleteById(remiseId);
    }
}

