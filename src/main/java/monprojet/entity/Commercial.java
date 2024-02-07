package monprojet.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
public class Commercial extends Employe{
    private float pourcentage;
}
