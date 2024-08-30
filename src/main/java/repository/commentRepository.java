package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.events.Comment;
import model.comment;
import model.news;
import java.util.List;

public interface commentRepository extends JpaRepository<comment, Long> {
    List<comment> findByNews(news news);
}
