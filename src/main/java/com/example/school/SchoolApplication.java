package com.example.school;

import com.example.school.Entities.Eleve;
import com.example.school.Entities.Parent;
import com.example.school.Repositories.EleveRepository;
import com.example.school.Repositories.ParentRepository;
import org.hibernate.engine.spi.SelfDirtinessTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolApplication {


    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }

   @Bean
    CommandLineRunner coucou(
           ParentRepository parentRepository,
           EleveRepository eleveRepository

   ){
        return args -> {
            Parent parent = new Parent();
            parent.setCinParent("3233L");
            Eleve eleve = new Eleve();
            eleve.setParent(parent);

            parentRepository.save(parent);
            eleveRepository.save(eleve);

        };
   }


}
