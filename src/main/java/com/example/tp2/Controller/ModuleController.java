package com.example.tp2.Controller;

import com.example.tp2.Modele.Module;  // Assurez-vous que cet import est présent
import com.example.tp2.Service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    // Récupérer tous les modules
    @RequestMapping("/Modules")
    public List<Module> getModules() {
        return moduleService.getAllModules();
    }

    // Récupérer un module par id
    @RequestMapping("/Modules/{id}")
    public Module getModule(@PathVariable Integer id) {
        return moduleService.getModule(id).orElse(null);
    }

    // Ajouter un nouveau module
    @PostMapping( "/Modules")
    public void ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);
    }

    // Modifier un module existant
    @PutMapping( "/Modules/{id}")
    public void modifierModule(@RequestBody Module module, @PathVariable Integer id) {
        moduleService.modifierModule(id, module);
    }

    // Supprimer un module
    @DeleteMapping("/Modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
    }
}
