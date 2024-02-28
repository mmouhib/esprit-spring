package tp.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.esprit.entities.Abonnement;
import tp.esprit.repository.IAbonnementRepository;

@Service
public class AbonnementService implements IAbonnementService {

    @Autowired
    IAbonnementRepository repository;


    @Override
    public void addAbonnement(Abonnement abonnement) {

    }
}
