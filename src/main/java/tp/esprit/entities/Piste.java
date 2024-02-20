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

public class Piste {

    @Id
    private Long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int longueur;
    private int pente;
}
