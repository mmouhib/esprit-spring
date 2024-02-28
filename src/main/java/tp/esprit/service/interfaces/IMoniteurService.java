package tp.esprit.service.interfaces;

import tp.esprit.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);

}
