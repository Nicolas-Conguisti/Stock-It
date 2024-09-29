package com.sit.Stock_it.Data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "PROJET")
public class ProjetVO {

    //ATTRIBUTS

    @Id
    @Column(name = "PROJET_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PROJET_ID;

    @Column(name = "PROJET_NOM", length = 100, nullable = false)
    private String PROJET_NOM;

    @Column(name = "PROJET_DESCRIPTION", length = 200, nullable = true)
    private String PROJET_DESCRIPTION;

    @Column(name = "PROJET_ADRESSE", length = 200, nullable = true)
    private String PROJET_ADRESSE;

    @Column(name = "PROJET_CODEPOSTAL", nullable = true)
    private Integer PROJET_CODEPOSTAL;

    @Column(name = "PROJET_STATUT", length = 50, nullable = false)
    private String PROJET_STATUT;

    @Column(name = "PROJET_TYPE", length = 50, nullable = false)
    private String PROJET_TYPE;

    @Column(name = "PROJET_DATEDEB", nullable = false)
    private LocalDate PROJET_DATEDEB;

    @Column(name = "PROJET_DATEFIN", nullable = true)
    private LocalDate PROJET_DATEFIN;

    @ManyToOne
    @JoinColumn(name = "UTILISATEUR_ID", nullable = false)
    private UtilisateurVO UTILISATEUR;

    //CONSTRUCTEURS

    public ProjetVO(String nom){
        this.PROJET_NOM = nom;
    }

    public ProjetVO(){
    }

    //GETTERS ET SETTERS

    public Long getPROJET_ID() {
        return PROJET_ID;
    }

    public void setPROJET_ID(Long PROJET_ID) {
        this.PROJET_ID = PROJET_ID;
    }

    public String getPROJET_NOM() {
        return PROJET_NOM;
    }

    public void setPROJET_NOM(String PROJET_NOM) {
        this.PROJET_NOM = PROJET_NOM;
    }

    public String getPROJET_DESCRIPTION() {
        return PROJET_DESCRIPTION;
    }

    public void setPROJET_DESCRIPTION(String PROJET_DESCRIPTION) {
        this.PROJET_DESCRIPTION = PROJET_DESCRIPTION;
    }

    public String getPROJET_ADRESSE() {
        return PROJET_ADRESSE;
    }

    public void setPROJET_ADRESSE(String PROJET_ADRESSE) {
        this.PROJET_ADRESSE = PROJET_ADRESSE;
    }

    public Integer getPROJET_CODEPOSTAL() {
        return PROJET_CODEPOSTAL;
    }

    public void setPROJET_CODEPOSTAL(Integer PROJET_CODEPOSTAL) {
        this.PROJET_CODEPOSTAL = PROJET_CODEPOSTAL;
    }

    public String getPROJET_STATUT() {
        return PROJET_STATUT;
    }

    public void setPROJET_STATUT(String PROJET_STATUT) {
        this.PROJET_STATUT = PROJET_STATUT;
    }

    public String getPROJET_TYPE() {
        return PROJET_TYPE;
    }

    public void setPROJET_TYPE(String PROJET_TYPE) {
        this.PROJET_TYPE = PROJET_TYPE;
    }

    public LocalDate getPROJET_DATEDEB() {
        return PROJET_DATEDEB;
    }

    public void setPROJET_DATEDEB(LocalDate PROJET_DATEDEB) {
        this.PROJET_DATEDEB = PROJET_DATEDEB;
    }

    public LocalDate getPROJET_DATEFIN() {
        return PROJET_DATEFIN;
    }

    public void setPROJET_DATEFIN(LocalDate PROJET_DATEFIN) {
        this.PROJET_DATEFIN = PROJET_DATEFIN;
    }

    public UtilisateurVO getUTILISATEUR_ID() {
        return UTILISATEUR;
    }

    public void setUTILISATEUR_ID(UtilisateurVO UTILISATEUR) {
        this.UTILISATEUR = UTILISATEUR;
    }
}
