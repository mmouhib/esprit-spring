package tp.esprit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Moniteur {
    @Id
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecu;
    @OneToMany
    private List<Cours> cours;
}
