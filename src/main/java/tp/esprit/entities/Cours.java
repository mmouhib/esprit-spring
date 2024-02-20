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

public class Cours {

    @Id
    private Long numCours;
    private int niveau;
    private TypeCours typeCours;
    private Support support;
}
