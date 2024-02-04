package com.example.school.Controllers;

import com.example.school.Entities.Eleve;
import com.example.school.Entities.Parent;
import com.example.school.Repositories.EleveRepository;
import com.example.school.Repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/parent")
public class ParentController {
    @Autowired
    private ParentRepository parentRepository;
    @GetMapping
    public List<Parent> getParents(){
        return parentRepository.findAll();
    }

    @GetMapping("/{parentId}")
    public Parent getParentById(@PathVariable String parentId){
        return parentRepository.findById(parentId).get();
    }

    @PostMapping
    public Parent addParent(@RequestBody Parent parent){
        return parentRepository.save(parent);
    }

    @PutMapping("/parentId")
    public void updateParent(@RequestBody Parent parent, @PathVariable String parentId){
        parentRepository.findById(parentId).map(parent1 -> {
            parent1.setCinParent(parent.getCinParent());
            parent1.setNom(parent.getNom());
            parent1.setPrenom(parent.getPrenom());
            parent1.setAdress(parent.getAdress());
            parent1.setEmail(parent.getEmail());
            return parentRepository.save(parent1);
        });
    }

    @DeleteMapping("/parentId")
    public void deleteParent(@PathVariable String parentId){
        parentRepository.deleteById(parentId);
    }
}
