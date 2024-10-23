package tn.esprit.examenblanc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Devi;
import tn.esprit.examenblanc.Entities.client;


@Repository
public interface ClientRepository extends JpaRepository<client,Long> {
}
