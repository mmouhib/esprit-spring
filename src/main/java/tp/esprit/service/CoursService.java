package tp.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.esprit.entities.Cours;
import tp.esprit.repository.ICoursRepository;
import tp.esprit.service.interfaces.ICoursService;

import java.util.List;

@Service
public class CoursService implements ICoursService {

    @Autowired
    private ICoursRepository repository;

    @Override
    public List<Cours> retrieveAllCourses() {
        return (List<Cours>) repository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return repository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return repository.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return repository.findById(numCours).get();
    }
}
