package monprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import monprojet.entity.Employe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {

    /**
     * Trouve un employé par son nom.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param nomDeLemploye
     * @return L'employe correspondant au nom fourni, ou null si pas trouvé.
     */
    Employe findByNom(String nomDeLemploye);

    @Query("SELECT COUNT(p) FROM Employe e JOIN e.projets p WHERE e.matricule = :matricule AND p.fin IS NULL")
    int countProjetsEnCours(@Param("matricule") String matricule);
}
