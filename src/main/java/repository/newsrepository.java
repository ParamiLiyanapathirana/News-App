package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.news;
import model.newscategory;
import java.util.List;

public interface newsrepository extends JpaRepository<news, Long> {
    List<news> findByCategories(newscategory category);
}
