package monprojet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
public class Administratif extends Employe{

    private String diplome;


}
