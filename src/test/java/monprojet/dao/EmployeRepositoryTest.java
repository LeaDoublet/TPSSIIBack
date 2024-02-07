package monprojet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import monprojet.entity.*;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
class EmployeRepositoryTest {

    @Autowired
    private EmployeRepository dao;

    @Test
    public void onTrouveUnEmployeParSonNom() {
        log.info("On peut trouver un employé par son nom (requête dans le repository)");
        Employe employe = dao.findByNom("Rémi Bastide");
        assertNotNull(employe, "On doit trouver l'employé Rémi Bastide dans data.sql");
        assertEquals("Remi.Bastide@univ-jfc.fr", employe.getEmail());
    }

    @Test
    public void calculePourcentageParticipationProjetParMatricule() {
        log.info("calcule du pourcentage de participation pour un employé");
        float pourcentageParticipation = dao.calculPourcentageParticipation(2); // ici on teste pour Elyes Lamine
        assertEquals(50.0, pourcentageParticipation,0.01); //marge d'erreur
    }
}
