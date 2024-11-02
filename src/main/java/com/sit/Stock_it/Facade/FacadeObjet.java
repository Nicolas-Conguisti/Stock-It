package com.sit.Stock_it.Facade;

import com.sit.Stock_it.Data.ObjetVO;
import com.sit.Stock_it.DAO.DAOObjet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacadeObjet {

    @Autowired
    private DAOObjet DAOObjet;

    public ObjetVO RecupererObjet(Integer idObjet) {

        ObjetVO Objet;
        Objet = DAOObjet.GetObjet(idObjet);

        return Objet;
    }

    public List<ObjetVO> RecupererListeObjets() {

        List<ObjetVO> ListeObjets;
        ListeObjets = DAOObjet.GetListeObjets();

        return ListeObjets;
    }
}