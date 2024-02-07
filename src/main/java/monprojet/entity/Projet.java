package monprojet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

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
}
