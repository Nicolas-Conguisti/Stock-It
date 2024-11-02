package com.sit.Stock_it.Controller;

import com.sit.Stock_it.Data.ObjetVO;
import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_LISTE_OBJET;
import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_OBJET;

import com.sit.Stock_it.Facade.FacadeObjet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControleurObjet {

    @Autowired
    private FacadeObjet FacadeObjet;

    @GetMapping("/ListeObjets")
    public String afficherListeObjets(Model model){

        List<ObjetVO> ListeObjets = FacadeObjet.RecupererListeObjets();

        model.addAttribute("Objets", ListeObjets);

        return PAGE_LISTE_OBJET;
    }

    @GetMapping("/Objet")
    public String afficherObjet(Model model){

        ObjetVO Objet = FacadeObjet.RecupererObjet(1);

        model.addAttribute("Objet", Objet);

        return PAGE_OBJET;
    }
}