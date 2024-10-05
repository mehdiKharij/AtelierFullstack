package com.example.tp2.Service;

import com.example.tp2.Modele.Module;
import com.example.tp2.Repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getAllModules() {
        List<Module> modules = new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;
    }

    public Optional<Module> getModule(Integer id) {
        return moduleRepository.findById(id);
    }

    public Module ajouterModule(Module module){
        return moduleRepository.save(module);
    }

    public void modifierModule(Integer id, Module module) {
        moduleRepository.save(module);
    }

    public void supprimerModule(Integer id) {
        moduleRepository.deleteById(id);
    }
}
