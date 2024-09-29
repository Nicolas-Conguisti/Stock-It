INSERT INTO utilisateur (UTILISATEUR_NOM, UTILISATEUR_PRENOM, UTILISATEUR_MAIL, UTILISATEUR_MDP)
VALUES ('Dupont', 'Jean', 'jean.dupont@example.com', 'motdepasse123');

INSERT INTO projet (PROJET_NOM, PROJET_DESCRIPTION, PROJET_ADRESSE, PROJET_CODEPOSTAL, PROJET_STATUT, PROJET_TYPE, PROJET_DATEDEB, PROJET_DATEFIN, UTILISATEUR_ID)
VALUES ('Projet A', 'Description du projet A', '123 Rue des Projets', 75001, 'En cours', 'Construction', '2024-01-01', '2024-12-31', 1);

INSERT INTO lieustock (LIEUSTOCK_NOM, LIEUSTOCK_ESPACETOTAL, LIEUSTOCK_ESPACEDISPO, LIEUSTOCK_ADRESSE, LIEUSTOCK_CODEPOSTAL, PROJET_ID)
VALUES ('Entrepôt Principal', 500, 300, '456 Rue des Stocks', 75001, 1);




INSERT INTO objet (
    OBJET_NOM,
    OBJET_MARQUE,
    OBJET_REFERENCE,
    OBJET_PRIX,
    OBJET_NOMBRE,
    OBJET_QUANTITE,
    OBJET_UTILISATION,
    OBJET_LONGUEUR,
    OBJET_LARGEUR,
    OBJET_HAUTEUR,
    OBJET_ID_CONTENANT,
    LIEUSTOCK_ID
) VALUES (
    'Table',        
    'BUT',     
    'Table blanche 0442',  
    100.00,                   
    1,  
    NULL,
    'Placement dans la cuisine',
    102.80,                       
    55.3,                        
    90.9,                       
    NULL,                   
    1
);

INSERT INTO objet (
    OBJET_NOM,
    OBJET_MARQUE,
    OBJET_REFERENCE,
    OBJET_PRIX,
    OBJET_NOMBRE,
    OBJET_QUANTITE,
    OBJET_UTILISATION,
    OBJET_LONGUEUR,
    OBJET_LARGEUR,
    OBJET_HAUTEUR,
    OBJET_ID_CONTENANT,
    LIEUSTOCK_ID
) VALUES (
    'TV',        
    'Philips',     
    'TV Noire 1080p Philips Z3',  
    180.00,                   
    1,  
    NULL,
    'Placement dans le salon',
    NULL,                       
    NULL,                        
    NULL,                       
    NULL,                   
    1
);

INSERT INTO objet (
    OBJET_NOM,
    OBJET_MARQUE,
    OBJET_REFERENCE,
    OBJET_PRIX,
    OBJET_NOMBRE,
    OBJET_QUANTITE,
    OBJET_UTILISATION,
    OBJET_LONGUEUR,
    OBJET_LARGEUR,
    OBJET_HAUTEUR,
    OBJET_ID_CONTENANT,
    LIEUSTOCK_ID
) VALUES (
    'Chaise',        
    'Ikea',     
    'Chaise blanche',  
    20.00,                   
    1,  
    NULL,
    'Placement dans le salon',
    NULL,                       
    NULL,                        
    NULL,                       
    NULL,                   
    1
);