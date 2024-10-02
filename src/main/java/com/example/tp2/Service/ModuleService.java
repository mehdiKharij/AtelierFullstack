package com.example.tp2.Servive;


import com.example.tp2.Repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tp2.Modele.Module;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public List<Module> getAllModules() {
        List<Module> modules = new ArrayList<>();
        moduleRepository.findAll().forEach(module -> modules.add(module));

        return modules;
    }
}
