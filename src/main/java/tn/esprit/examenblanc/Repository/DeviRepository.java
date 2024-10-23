package tn.esprit.examenblanc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Devi;

@Repository
public interface DeviRepository extends JpaRepository<Devi,Long> {
}
