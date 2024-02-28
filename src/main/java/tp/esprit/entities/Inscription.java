package tp.esprit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Inscription {

    @Id
    private int numInscription;
    private long numSemaine;
    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cours cours;
}
