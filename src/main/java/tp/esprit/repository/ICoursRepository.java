package tp.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tp.esprit.entities.Cours;

@Repository
public interface ICoursRepository extends CrudRepository<Cours, Long> {

}
