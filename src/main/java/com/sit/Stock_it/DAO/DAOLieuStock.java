package com.sit.Stock_it.DAO;

import com.sit.Stock_it.Data.LieuStockVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DAOLieuStock extends JpaRepository<LieuStockVO, Long> {

    @Query(value = "SELECT * FROM lieustock WHERE LIEUSTOCK_ID= :LIEUSTOCK_ID", nativeQuery = true)
    LieuStockVO GetLieuStock(@Param("LIEUSTOCK_ID")Integer LIEUSTOCK_ID);

    @Query(value = "SELECT * FROM lieustock", nativeQuery = true)
    List<LieuStockVO> GetListeLieuxStock();
}