SET search_path TO projet;


-- Supprime toutes les données
DELETE FROM role;
DELETE FROM compte;


-- Insère les données

-- Compte

INSERT INTO compte (idcompte, pseudo, motdepasse, email ) VALUES 
( 1, 'geek', 'geek', 'geek@jfox.fr' ),
( 2, 'chef', 'chef', 'chef@jfox.fr' ),
( 3, 'job', 'job', 'job@jfox.fr' );

ALTER TABLE compte ALTER COLUMN idcompte RESTART WITH 4;


-- Role

INSERT INTO role (idcompte, role) VALUES 
( 1, 'ADMINISTRATEUR' ),
( 1, 'UTILISATEUR' ),
( 2, 'UTILISATEUR' ),
( 3, 'UTILISATEUR' );
 
