package com.sit.Stock_it.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "LIEUSTOCK")
public class LieuStockVO {

    //ATTRIBUTS

    @Id
    @Column(name = "LIEUSTOCK_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LIEUSTOCK_ID;

    @Column(name = "LIEUSTOCK_NOM", length = 100, nullable = false)
    private String LIEUSTOCK_NOM;

    @Column(name = "LIEUSTOCK_ESPACETOTAL", nullable = true)
    private Short LIEUSTOCK_ESPACETOTAL;

    @Column(name = "LIEUSTOCK_ESPACEDISPO", nullable = true)
    private Short LIEUSTOCK_ESPACEDISPO;

    @Column(name = "LIEUSTOCK_ADRESSE", length = 200, nullable = true)
    private String LIEUSTOCK_ADRESSE;

    @Column(name = "LIEUSTOCK_CODEPOSTAL", nullable = true)
    private Integer LIEUSTOCK_CODEPOSTAL;

    @ManyToOne
    @JoinColumn(name = "PROJET_ID", nullable = false)
    private ProjetVO PROJET;

    //CONSTRUCTEURS

    public LieuStockVO(String nom) {
        this.LIEUSTOCK_NOM = nom;
    }

    public LieuStockVO() {
    }

    //GETTERS ET SETTERS

    public Long getLIEUSTOCK_ID() {
        return LIEUSTOCK_ID;
    }

    public void setLIEUSTOCK_ID(Long LIEUSTOCK_ID) {
        this.LIEUSTOCK_ID = LIEUSTOCK_ID;
    }

    public String getLIEUSTOCK_NOM() {
        return LIEUSTOCK_NOM;
    }

    public void setLIEUSTOCK_NOM(String LIEUSTOCK_NOM) {
        this.LIEUSTOCK_NOM = LIEUSTOCK_NOM;
    }

    public Short getLIEUSTOCK_ESPACETOTAL() {
        return LIEUSTOCK_ESPACETOTAL;
    }

    public void setLIEUSTOCK_ESPACETOTAL(Short LIEUSTOCK_ESPACETOTAL) {
        this.LIEUSTOCK_ESPACETOTAL = LIEUSTOCK_ESPACETOTAL;
    }

    public Short getLIEUSTOCK_ESPACEDISPO() {
        return LIEUSTOCK_ESPACEDISPO;
    }

    public void setLIEUSTOCK_ESPACEDISPO(Short LIEUSTOCK_ESPACEDISPO) {
        this.LIEUSTOCK_ESPACEDISPO = LIEUSTOCK_ESPACEDISPO;
    }

    public String getLIEUSTOCK_ADRESSE() {
        return LIEUSTOCK_ADRESSE;
    }

    public void setLIEUSTOCK_ADRESSE(String LIEUSTOCK_ADRESSE) {
        this.LIEUSTOCK_ADRESSE = LIEUSTOCK_ADRESSE;
    }

    public Integer getLIEUSTOCK_CODEPOSTAL() {
        return LIEUSTOCK_CODEPOSTAL;
    }

    public void setLIEUSTOCK_CODEPOSTAL(Integer LIEUSTOCK_CODEPOSTAL) {
        this.LIEUSTOCK_CODEPOSTAL = LIEUSTOCK_CODEPOSTAL;
    }

    public ProjetVO getPROJET_ID() {
        return PROJET;
    }

    public void setPROJET_ID(ProjetVO PROJET) {
        this.PROJET = PROJET;
    }
}
