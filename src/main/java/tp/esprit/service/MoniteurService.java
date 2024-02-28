package tp.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.esprit.entities.Moniteur;
import tp.esprit.repository.IMoniteurRepository;
import tp.esprit.service.interfaces.IMoniteurService;

import java.util.List;


@Service
public class MoniteurService implements IMoniteurService {

    @Autowired
    private IMoniteurRepository repository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) repository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return repository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return repository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return repository.findById(numMoniteur).get();
    }
}
