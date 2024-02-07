package monprojet.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@DiscriminatorValue("Commercial")
@Entity
public class Commercial extends Employe{
    private float pourcentage;
}
