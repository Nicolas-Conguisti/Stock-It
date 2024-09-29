package com.sit.Stock_it.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "UTILISATEUR")
public class UtilisateurVO {

    //ATTRIBUTS

    @Id
    @Column(name = "UTILISATEUR_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UTILISATEUR_ID;

    @Column(name = "UTILISATEUR_NOM", length = 100, nullable = false)
    private String UTILISATEUR_NOM;

    @Column(name = "UTILISATEUR_PRENOM", length = 100, nullable = false)
    private String UTILISATEUR_PRENOM;

    @Column(name = "UTILISATEUR_MAIL", length = 100, nullable = false)
    private String UTILISATEUR_MAIL;

    @Column(name = "UTILISATEUR_MDP", length = 255, nullable = false)
    private String UTILISATEUR_MDP;

    //CONSTRUCTEURS

    public UtilisateurVO(String nom){
        this.UTILISATEUR_NOM = nom;
    }

    public UtilisateurVO(){
    }

    //GETTERS ET SETTERS

    public Long getUTILISATEUR_ID() {
        return UTILISATEUR_ID;
    }

    public void setUTILISATEUR_ID(Long UTILISATEUR_ID) {
        this.UTILISATEUR_ID = UTILISATEUR_ID;
    }

    public String getUTILISATEUR_NOM() {
        return UTILISATEUR_NOM;
    }

    public void setUTILISATEUR_NOM(String UTILISATEUR_NOM) {
        this.UTILISATEUR_NOM = UTILISATEUR_NOM;
    }

    public String getUTILISATEUR_PRENOM() {
        return UTILISATEUR_PRENOM;
    }

    public void setUTILISATEUR_PRENOM(String UTILISATEUR_PRENOM) {
        this.UTILISATEUR_PRENOM = UTILISATEUR_PRENOM;
    }

    public String getUTILISATEUR_MAIL() {
        return UTILISATEUR_MAIL;
    }

    public void setUTILISATEUR_MAIL(String UTILISATEUR_MAIL) {
        this.UTILISATEUR_MAIL = UTILISATEUR_MAIL;
    }

    public String getUTILISATEUR_MDP() {
        return UTILISATEUR_MDP;
    }

    public void setUTILISATEUR_MDP(String UTILISATEUR_MDP) {
        this.UTILISATEUR_MDP = UTILISATEUR_MDP;
    }
}
