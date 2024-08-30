package model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class news {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;

    private String content;

    @ManyToMany
    private List<newscategory> categories;

    public news(Long id, String title, String content, List<newscategory> categories) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<newscategory> getCategories() {
        return categories;
    }

    public void setCategories(List<newscategory> categories) {
        this.categories = categories;
    }
}
