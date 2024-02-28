package tp.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tp.esprit.entities.Abonnement;
import tp.esprit.entities.TypeAbon;

import java.util.List;

@Repository
public interface IAbonnementRepository extends CrudRepository<Abonnement, Long> {
    public List<Abonnement> findByTypeAbonnement(TypeAbon typeAbonnement);
}
