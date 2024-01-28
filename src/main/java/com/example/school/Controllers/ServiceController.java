package com.example.school.Controllers;

import com.example.school.Entities.Remise;
import com.example.school.Entities.Service;
import com.example.school.Repositories.RemiseRepository;
import com.example.school.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceRepository serviceRepository;
    @GetMapping
    public List<Service> getServices(){
        return serviceRepository.findAll();
    }

    @GetMapping("/{serviceId}")
    public Optional<Service> getServiceById(@PathVariable Long serviceId){
        return serviceRepository.findById(serviceId);
    }

    @PostMapping
    public Service addService(@RequestBody Service service){
        return serviceRepository.save(service);
    }

    @PutMapping("/serviceId")
    public void updateService(@RequestBody Service service, @PathVariable Long serviceId){
        serviceRepository.findById(serviceId).map(service1 -> {
            service1.setNomService(service.getNomService());
            service1.setMontant(service.getMontant());
            service1.setPeriodicite(service.getPeriodicite());
            return serviceRepository.save(service1);
        });
    }

    @DeleteMapping("/serviceId")
    public void deleteService(@PathVariable Long serviceId){
        serviceRepository.deleteById(serviceId);
    }
}
