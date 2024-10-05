package com.example.tp2.Controller;


import com.example.tp2.Modele.Cours;
import com.example.tp2.Modele.Module;
import com.example.tp2.Service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CoursController {

    @Autowired //pour faire de l’injection de la classe CoursService au niveau du Controller
    private CoursService coursService;

    @RequestMapping("/modules/{id}/cours") //pour récupérer les cours d’un Module, nous indiquons l’id du
    //module en question
    public List<Cours> getAllCours(@PathVariable Integer id){
        return coursService.getAllCours(id);
    }
    @RequestMapping("/modules/{moduleId}/cours/{id}")
    //pour avoir un cours donné d’un module donné
    public Optional<Cours> getCours(@PathVariable Integer id){
        return coursService.getCours(id);
    }
    @RequestMapping(method= RequestMethod.POST, value="/modules/{moduleId}/cours")
    public void ajouterCours(@RequestBody Cours cours, @PathVariable Integer moduleId) {
        cours.setModule(new Module(moduleId,"",""));
        coursService.ajouterCours(cours);
    }
    @RequestMapping(method=RequestMethod.PUT, value="/modules/{moduleId}/cours/{id}")
    public void modifierCours(@RequestBody Cours cours, @PathVariable Integer moduleId, @PathVariable Integer id)
    {
        cours.setModule(new Module(moduleId,"",""));
        coursService.modifierCours(cours);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{moduleId}/cours/{id}")
    public void supprimerCours(@PathVariable Integer id) {
        coursService.supprimerCours(id);
    }

}
