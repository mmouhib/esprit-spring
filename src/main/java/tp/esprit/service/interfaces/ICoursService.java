package tp.esprit.service.interfaces;

import tp.esprit.entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();

    Cours addCours(Cours cours);

    Cours updateCours(Cours cours);

    Cours retrieveCours(Long numCours);

}
