package com.example.tp2.Repository;

import com.example.tp2.Modele.Cours;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursRepository extends CrudRepository<Cours, Integer> {
    //en plus des méthodes implémentées par défaut au niveau de la classe CrudRepository
    public List<Cours> findByModuleId(Integer moduleId);
}
