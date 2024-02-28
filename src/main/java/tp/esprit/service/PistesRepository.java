package tp.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.esprit.entities.Piste;
import tp.esprit.service.interfaces.IPistesRepository;

import java.util.List;

@Service
public class PistesRepository implements IPistesRepository {

    @Autowired
    private IPistesRepository repository;


    @Override
    public List retrieveAllPistes() {
        return repository.retrieveAllPistes();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return repository.addPiste(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return repository.updatePiste(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return repository.retrievePiste(numPiste);
    }
}
