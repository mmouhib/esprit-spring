package tp.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tp.esprit.entities.Moniteur;

@Repository
public interface IMoniteurRepository extends CrudRepository<Moniteur, Long> {
}
