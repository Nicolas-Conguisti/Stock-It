package com.sit.Stock_it.DAO;

import com.sit.Stock_it.Data.ObjetVO;
import com.sit.Stock_it.Data.ProjetVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DAOProjet extends JpaRepository<ProjetVO, Long> {

    @Query(value = "SELECT * FROM projet WHERE PROJET_ID= :PROJET_ID", nativeQuery = true)
    ProjetVO GetProjet(@Param("PROJET_ID")Integer PROJET_ID);

    @Query(value = "SELECT * FROM projet", nativeQuery = true)
    List<ProjetVO> GetListeProjets();
}