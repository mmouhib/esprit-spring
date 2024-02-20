package tp.esprit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Abonnement {

    @Id
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    private TypeAbon typeAbonnement;


}
