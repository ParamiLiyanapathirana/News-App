package model;
import model.news;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class newscategory {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    @ManyToMany(mappedBy = "categories")

    private List<news> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<model.news> getNews() {
        return news;
    }

    public void setNews(List<model.news> news) {
        this.news = news;
    }

    public newscategory(Long id, String name, List<model.news> news) {
        this.id = id;
        this.name = name;
        this.news = news;
    }
}
