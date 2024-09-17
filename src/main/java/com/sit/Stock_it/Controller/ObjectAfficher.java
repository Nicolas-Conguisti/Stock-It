package com.sit.Stock_it.Controller;

import com.sit.Stock_it.Data.Objet;
import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_INDEX;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObjectAfficher {

    @GetMapping("/")
    public String afficherPlanche(Model model){
        Objet planche = new Objet("Planche de bois");

        Objet carton = new Objet("carton");

        model.addAttribute("idCarton", carton.getId());

        model.addAttribute("nomCarton", carton.getNom());

        System.out.println("APPEL CONTROLLER PRINCIPAL");

        return PAGE_INDEX;
    }
}