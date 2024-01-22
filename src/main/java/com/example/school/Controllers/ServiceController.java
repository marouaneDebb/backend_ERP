package com.example.school.Controllers;

<<<<<<< HEAD
import com.example.school.Entities.Remise;
import com.example.school.Entities.Service;
import com.example.school.Repositories.RemiseRepository;
import com.example.school.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589

@RestController
@RequestMapping("/service")
public class ServiceController {
<<<<<<< HEAD
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

            return serviceRepository.save(service1);
        });
    }

    @DeleteMapping("/serviceId")
    public void deleteService(@PathVariable Long serviceId){
        serviceRepository.deleteById(serviceId);
    }
=======
>>>>>>> 067d19ee813611a13a609e57297e634d9bdd7589
}
