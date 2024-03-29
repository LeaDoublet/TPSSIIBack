-- Initialisation des tables
INSERT INTO Employe(matricule,nom,montantprime,pourcentage,superieur_matricule,diplome, dtype, email) VALUES
    (1, 'Rémi Bastide',200.0,null,null,null, 'Technique' ,'Remi.Bastide@univ-jfc.fr'), -- Les clés sont auto-générées
    (2, 'Elyes Lamine',null,null,null,'master','Administratif', 'Elyes.Lamine@univ-jfc.fr'),
    (3, 'Jean-Marie Pecatte',null,20.0,1 ,null,'Commercial', 'United States of America');
-- On peut fixer les clés auto-générées, mais il faut ensuite
-- réinitialiser le compteur de clé auto-générée
-- Attention : la syntaxe est différente selon le SGBD utilisé
-- Ici la syntaxe pour le SGBD H2
ALTER TABLE Employe ALTER COLUMN matricule RESTART WITH 4;
INSERT INTO Projet (code,nom, debut, fin) VALUES (1,'Projet A', '2024-01-01', NULL);
INSERT INTO Projet (code,nom,  debut, fin) VALUES (2,'Projet B', '2024-02-01', '2024-03-01');
INSERT INTO Projet (code,nom, debut, fin) VALUES (3,'Projet C', '2024-01-01', NULL);
INSERT INTO Participation(id, affectation_code, contributeur_matricule, pourcentage, role) VALUES
    (1, (SELECT code FROM Projet WHERE nom = 'Projet A'), (SELECT matricule FROM Employe WHERE nom = 'Elyes Lamine'), 50, 'Technicien'),
    (2, (SELECT code FROM Projet WHERE nom = 'Projet B'), (SELECT matricule FROM Employe WHERE nom ='Jean-Marie Pecatte'), 25, 'Developpeur'),
    (3, (SELECT code FROM Projet WHERE nom = 'Projet B'), (SELECT matricule FROM Employe WHERE nom = 'Elyes Lamine'), 13, 'Technicien'),
    (4, (SELECT code FROM Projet WHERE nom = 'Projet C'), (SELECT matricule FROM Employe WHERE nom = 'Jean-Marie Pecatte'), 13, 'Technicien');