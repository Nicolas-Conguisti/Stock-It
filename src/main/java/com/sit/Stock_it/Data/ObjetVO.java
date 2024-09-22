package com.sit.Stock_it.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "OBJET")
public class ObjetVO {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "Nom")
    private String nom;

    public ObjetVO(String nom) {
        this.nom = nom;
    }

    public ObjetVO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {this.id = id;}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
