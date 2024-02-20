package tp.esprit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Skieur {
    @Id
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private int dateNaissance;
    private String ville;

}
