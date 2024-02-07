package monprojet.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@DiscriminatorValue("Technique")
@Entity
public class Technique extends Employe{
    private float montantPrime;
}
