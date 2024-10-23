package tn.esprit.examenblanc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Product;
import tn.esprit.examenblanc.Entities.Projet;


@Repository
public interface ProjetRepository  extends JpaRepository<Projet,Long> {
}
