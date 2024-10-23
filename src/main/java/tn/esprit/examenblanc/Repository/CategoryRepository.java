package tn.esprit.examenblanc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
