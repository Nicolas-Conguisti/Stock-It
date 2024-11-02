package com.sit.Stock_it.DAO;

import com.sit.Stock_it.Data.ObjetVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DAOObjet extends JpaRepository<ObjetVO, Long> {

    @Query(value = "SELECT * FROM objet", nativeQuery = true)
    List<ObjetVO> GetListeObjets();

    @Query(value = "SELECT * FROM objet WHERE OBJET_ID= :OBJET_ID", nativeQuery = true)
    ObjetVO GetObjet(@Param("OBJET_ID")Integer OBJET_ID);
}