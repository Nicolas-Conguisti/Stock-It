package com.sit.Stock_it.Controller;

import com.sit.Stock_it.DAO.ObjetDAO;
import com.sit.Stock_it.Data.ObjetVO;
import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_INDEX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControleurObjet {

    @Autowired
    private ObjetDAO ObjetDAO;

    @GetMapping("/")
    public String afficherObjet(Model model){

        List<ObjetVO> ListeObjets = RecupererListeObjets();

        model.addAttribute("Objets", ListeObjets);

        return PAGE_INDEX;
    }

    private List<ObjetVO> RecupererListeObjets() {

        List<ObjetVO> ListeObjets;
        ListeObjets = ObjetDAO.GetListeObjets();

        return ListeObjets;
    }
}