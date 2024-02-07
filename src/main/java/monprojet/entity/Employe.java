package monprojet.entity;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Inheritance
@Entity
public class Employe {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer matricule;

    @NonNull
    private String nom;

    @Email
    private String email;

    @ManyToOne
    private Employe superieur;

    @OneToMany(mappedBy = "superieur")
    private List<Employe> subordonnes;

   @ManyToMany
    private List<Projet> projets;
}
