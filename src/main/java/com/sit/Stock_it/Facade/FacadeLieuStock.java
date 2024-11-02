package com.sit.Stock_it.Facade;

import com.sit.Stock_it.Data.LieuStockVO;
import com.sit.Stock_it.DAO.DAOLieuStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacadeLieuStock {

    @Autowired
    private DAOLieuStock DAOLieuStock;

    public LieuStockVO RecupererLieuStock(Integer idLieuStock) {

        LieuStockVO LieuStock;
        LieuStock = DAOLieuStock.GetLieuStock(idLieuStock);

        return LieuStock;
    }

    public List<LieuStockVO> RecupererListeLieuxStock() {

        List<LieuStockVO> ListeLieuxStock;
        ListeLieuxStock = DAOLieuStock.GetListeLieuxStock();

        return ListeLieuxStock;
    }
}