package com.sit.Stock_it.Controller;

import com.sit.Stock_it.Data.ProjetVO;
import com.sit.Stock_it.Facade.FacadeProjet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_LISTE_PROJETS;
import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_PROJET;

@Controller
public class ControleurProjet {

    @Autowired
    private FacadeProjet FacadeProjet;

    @GetMapping("/ListeProjets")
    public String afficherListeProjets(Model model){

        List<ProjetVO> ListeProjets = FacadeProjet.RecupererListeProjets();

        model.addAttribute("Projets", ListeProjets);

        return PAGE_LISTE_PROJETS;
    }

    @GetMapping("/Projet")
    public String afficherProjet(Model model){

        ProjetVO Projet = FacadeProjet.RecupererProjet(1);

        model.addAttribute("Projet", Projet);

        return PAGE_PROJET;
    }

}
