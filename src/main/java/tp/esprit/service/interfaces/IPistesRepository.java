package tp.esprit.service.interfaces;


import tp.esprit.entities.Piste;

import java.util.List;

public interface IPistesRepository {
    List retrieveAllPistes();

    Piste addPiste(Piste piste);

    Piste updatePiste(Piste piste);

    Piste retrievePiste(Long numPiste);

}
