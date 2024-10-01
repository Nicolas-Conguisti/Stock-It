package com.sit.Stock_it.Controller;

import com.sit.Stock_it.Data.ObjetVO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.sit.Stock_it.Constantes.ConstantesPages.PAGE_INDEX;

public class ControleurPrincipal {

    @GetMapping("/")
    public String afficherIndex(Model model){

        return PAGE_INDEX;
    }
}
