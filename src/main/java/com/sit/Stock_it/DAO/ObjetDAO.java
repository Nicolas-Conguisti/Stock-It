package com.sit.Stock_it.DAO;

import com.sit.Stock_it.Data.ObjetVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ObjetDAO extends JpaRepository<ObjetVO, Long> {

    @Query(value = "SELECT * FROM objet", nativeQuery = true)
    List<ObjetVO> GetListeObjets();
}
