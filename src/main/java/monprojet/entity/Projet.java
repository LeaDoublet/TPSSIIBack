package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
public class Projet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @NonNull
    private String nom;

    @DateTimeFormat
    private LocalDate debut;

    @DateTimeFormat
    private LocalDate fin;

    @ManyToMany(mappedBy = "projets")
    private List<Employe> employes;
}
