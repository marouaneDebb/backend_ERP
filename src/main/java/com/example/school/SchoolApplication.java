package com.example.school;

import ch.qos.logback.core.util.DelayStrategy;
import com.example.school.Entities.*;
import com.example.school.Repositories.*;
import org.hibernate.engine.spi.SelfDirtinessTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SchoolApplication {


    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }

   @Bean
    CommandLineRunner coucou(
           ParentRepository parentRepository,
           EleveRepository eleveRepository,
           PaiementRepository paiementRepository,
           ServiceRepository serviceRepository,
           FactureRepository factureRepository,
           RemiseRepository remiseRepository,
           CategorieServiceRepository categorieServiceRepository

   ){
        return args -> {
            Parent parent = new Parent();
            parent.setCinParent("3233L");
            parent.setNom("TTo");
            parent.setPrenom("KHOKI");
            parentRepository.save(parent);

            CategorieService categorieService = new CategorieService();
            categorieService.setNomCategorie("Ext");
            categorieServiceRepository.save(categorieService);

            Eleve eleve = new Eleve();
            eleve.setNom("Tati");
            eleve.setPrenom("TATITO");
            eleve.setParent(parent);


            Eleve eleve2 = new Eleve();
            eleve2.setNom("TADFj");
            eleve2.setPrenom("KIKI");
            eleve2.setParent(parent);
            eleveRepository.save(eleve2);
            eleveRepository.save(eleve);


            Paiement paiement = new Paiement(eleve);
            paiement.setMontant(23.3);
            Paiement paiement2 = new Paiement(eleve2);
            paiement.setMontant(23458.3);
            paiementRepository.save(paiement);
            paiementRepository.save(paiement2);

            Service natation = new Service(categorieService);
            natation.setMontant(23);
            natation.setNom("natation");
            natation.getEleves().add(eleve);
            natation.getEleves().add(eleve2);
            natation.getEleves().add(eleve2);
            serviceRepository.save(natation);

            Facture facture = new Facture();
            facture.setMontant(232);
            factureRepository.save(facture);
            paiement.setFacture(facture);
            paiement2.setFacture(facture);
            paiementRepository.save(paiement);
            paiementRepository.save(paiement2);

            Remise remise = new Remise(natation);
            remiseRepository.save(remise);
            serviceRepository.save(natation);


            remiseRepository.findAll().forEach(p->{
                System.out.println(p);
            });
            factureRepository.findAll().forEach(p->{
                System.out.println(p);
            });

            serviceRepository.findAll().forEach(p->{
                System.out.println(p);
            });


            paiementRepository.findAll().forEach(p->{
                System.out.println(p);
            });

            eleveRepository.findAll().forEach(p->{
                System.out.println(p);
            });
 parentRepository.findAll().forEach(p->{
                System.out.println(p);
            });

        };
   }


}
