package com.sit.Stock_it.Facade;

import com.sit.Stock_it.DAO.DAOProjet;
import com.sit.Stock_it.Data.ObjetVO;
import com.sit.Stock_it.Data.ProjetVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacadeProjet {

    @Autowired
    private DAOProjet DAOProjet;

    public List<ProjetVO> RecupererListeProjets() {

        List<ProjetVO> ListeProjets;
        ListeProjets = DAOProjet.GetListeProjets();

        return ListeProjets;
    }

    public ProjetVO RecupererProjet(Integer idProjet) {

        ProjetVO projet = DAOProjet.GetProjet(idProjet);

        return projet;
    }

}