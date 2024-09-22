package com.sit.Stock_it.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "OBJET")
public class ObjetVO {

    //ATTRIBUTS

    @Id
    @Column(name = "OBJET_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long OBJET_ID;

    @Column(name = "OBJET_NOM", nullable = false)
    private String OBJET_NOM;

    @Column(name = "OBJET_MARQUE")
    private String OBJET_MARQUE;

    @Column(name = "OBJET_REFERENCE")
    private String OBJET_REFERENCE;

    @Column(name = "OBJET_PRIX")
    private Long OBJET_PRIX;

    @Column(name = "OBJET_NOMBRE")
    private Integer OBJET_NOMBRE;

    @Column(name = "OBJET_QUANTITE")
    private String OBJET_QUANTITE;

    @Column(name = "OBJET_UTILISATION")
    private String OBJET_UTILISATION;

    @Column(name = "OBJET_LONGUEUR")
    private Integer OBJET_LONGUEUR;

    @Column(name = "OBJET_LARGEUR")
    private Integer OBJET_LARGEUR;

    @Column(name = "OBJET_HAUTEUR")
    private Integer OBJET_HAUTEUR;

    @Column(name = "OBJET_ID_CONTENANT")
    private Long OBJET_ID_CONTENANT;

    @Column(name = "LIEUSTOCK_ID", nullable = false)
    //METTRE JOIN
    private Integer LIEUSTOCK_ID;


//CONSTRUCTEURS

    public ObjetVO(String nom) {
        this.OBJET_NOM = nom;
    }

    public ObjetVO() {
    }

    //GETTERS ET SETTERS

    public Integer getOBJET_LARGEUR() {
        return OBJET_LARGEUR;
    }

    public void setOBJET_LARGEUR(Integer OBJET_LARGEUR) {
        this.OBJET_LARGEUR = OBJET_LARGEUR;
    }

    public Integer getOBJET_LONGUEUR() {
        return OBJET_LONGUEUR;
    }

    public void setOBJET_LONGUEUR(Integer OBJET_LONGUEUR) {
        this.OBJET_LONGUEUR = OBJET_LONGUEUR;
    }

    public String getOBJET_UTILISATION() {
        return OBJET_UTILISATION;
    }

    public void setOBJET_UTILISATION(String OBJET_UTILISATION) {
        this.OBJET_UTILISATION = OBJET_UTILISATION;
    }

    public Integer getOBJET_HAUTEUR() {
        return OBJET_HAUTEUR;
    }

    public void setOBJET_HAUTEUR(Integer OBJET_HAUTEUR) {
        this.OBJET_HAUTEUR = OBJET_HAUTEUR;
    }

    public Long getOBJET_ID_CONTENANT() {
        return OBJET_ID_CONTENANT;
    }

    public void setOBJET_ID_CONTENANT(Long OBJET_ID_CONTENANT) {
        this.OBJET_ID_CONTENANT = OBJET_ID_CONTENANT;
    }

    public String getOBJET_QUANTITE() {
        return OBJET_QUANTITE;
    }

    public void setOBJET_QUANTITE(String OBJET_QUANTITE) {
        this.OBJET_QUANTITE = OBJET_QUANTITE;
    }

    public Integer getOBJET_NOMBRE() {
        return OBJET_NOMBRE;
    }

    public void setOBJET_NOMBRE(Integer OBJET_NOMBRE) {
        this.OBJET_NOMBRE = OBJET_NOMBRE;
    }

    public Long getOBJET_PRIX() {
        return OBJET_PRIX;
    }

    public void setOBJET_PRIX(Long OBJET_PRIX) {
        this.OBJET_PRIX = OBJET_PRIX;
    }

    public String getOBJET_REFERENCE() {
        return OBJET_REFERENCE;
    }

    public void setOBJET_REFERENCE(String OBJET_REFERENCE) {
        this.OBJET_REFERENCE = OBJET_REFERENCE;
    }

    public String getOBJET_MARQUE() {
        return OBJET_MARQUE;
    }

    public void setOBJET_MARQUE(String OBJET_MARQUE) {
        this.OBJET_MARQUE = OBJET_MARQUE;
    }

    public String getOBJET_NOM() {
        return OBJET_NOM;
    }

    public void setOBJET_NOM(String OBJET_NOM) {
        this.OBJET_NOM = OBJET_NOM;
    }

    public Long getOBJET_ID() {
        return OBJET_ID;
    }

    public void setOBJET_ID(Long OBJET_ID) {
        this.OBJET_ID = OBJET_ID;
    }

    public Integer getLIEUSTOCK_ID() {
        return LIEUSTOCK_ID;
    }

    public void setLIEUSTOCK_ID(Integer LIEUSTOCK_ID) {
        this.LIEUSTOCK_ID = LIEUSTOCK_ID;
    }

}
