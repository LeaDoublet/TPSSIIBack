package monprojet.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
public class Technique extends Employe{
    private float montantPrime;
}
