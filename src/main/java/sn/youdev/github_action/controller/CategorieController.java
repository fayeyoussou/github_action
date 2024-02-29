package sn.youdev.github_action.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sn.youdev.github_action.Repository.CategorieRepository;
import sn.youdev.github_action.model.Categorie;

import java.util.List;

@Controller @RequiredArgsConstructor
@RequestMapping("/categorie")
public class CategorieController {
    private final CategorieRepository categorieRepository;

    @GetMapping
    private ResponseEntity<List<Categorie>> liste(){
        return ResponseEntity.ok(categorieRepository.findAll());
    }
    @PostMapping
    private ResponseEntity<Categorie> liste(@RequestBody final Categorie categorie){
        return ResponseEntity.ok(categorieRepository.save(categorie));
    }
}
