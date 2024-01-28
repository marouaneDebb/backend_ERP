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
    public Optional<Parent> getParentById(@PathVariable Long parentId){
        return parentRepository.findById(parentId);
    }

    @PostMapping
    public Parent addParent(@RequestBody Parent parent){
        return parentRepository.save(parent);
    }

    @PutMapping("/parentId")
    public void updateParent(@RequestBody Parent parent, @PathVariable Long parentId){
        parentRepository.findById(parentId).map(parent1 -> {

            return parentRepository.save(parent1);
        });
    }

    @DeleteMapping("/parentId")
    public void deleteParent(@PathVariable Long parentId){
        parentRepository.deleteById(parentId);
    }
}
