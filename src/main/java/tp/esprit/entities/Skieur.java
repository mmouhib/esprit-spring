package tp.esprit.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes;
    @OneToOne
    private Abonnement abonnement;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;

}
