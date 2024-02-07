package monprojet.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@DiscriminatorValue("Administratif")
@Entity
public class Administratif extends Employe{

    private String diplome;


}
