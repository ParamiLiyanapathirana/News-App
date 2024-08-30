package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.newscategory;

import java.util.List;

public interface newsCategoryRepository extends JpaRepository<newscategory, Long> {
    List<newscategory> findAll();
}



