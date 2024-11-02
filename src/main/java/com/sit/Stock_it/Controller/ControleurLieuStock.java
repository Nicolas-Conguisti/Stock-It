package com.sit.Stock_it.Controller;

import com.sit.Stock_it.Data.LieuStockVO;
import com.sit.Stock_it.Facade.FacadeLieuStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_LIEUSTOCK;
import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_LISTE_LIEUXSTOCK;

@Controller
public class ControleurLieuStock {

    @Autowired
    private com.sit.Stock_it.Facade.FacadeObjet FacadeObjet;

    @GetMapping("/LieuStock")
    public String afficherLieuStock(Model model){

        LieuStockVO LieuStock = FacadeLieuStock.RecupererLieuStock(1);

        model.addAttribute("LieuStock", LieuStock);

        return PAGE_LIEUSTOCK;
    }

    @GetMapping("/ListeLieuxStock")
    public String afficherListeLieuxStock(Model model){

        List<LieuStockVO> ListeLieuxStock = FacadeLieuStock.RecupererListeLieuxStock();

        model.addAttribute("LieuxStock", ListeLieuxStock);

        return PAGE_LISTE_LIEUXSTOCK;
    }
}