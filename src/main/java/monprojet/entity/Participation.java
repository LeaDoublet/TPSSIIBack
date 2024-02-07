package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
public class Participation {
    @Getter
    @Setter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String role;

    @NonNull
    private Float pourcentage;

    @ManyToOne
    private Employe contributeur;

    @ManyToOne
    private Projet affectation;
}
