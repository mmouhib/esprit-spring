package tp.esprit.repository;

import org.springframework.stereotype.Repository;
import tp.esprit.entities.Piste;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IPistesRepository extends CrudRepository<Piste, Long>{
}
