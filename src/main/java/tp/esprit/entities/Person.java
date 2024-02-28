package tp.esprit.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes;
    @OneToOne
    private Abonnement abonnement;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
}
