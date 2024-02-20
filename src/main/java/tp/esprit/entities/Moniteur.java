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

public class Moniteur {
    @Id
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecu;

}
