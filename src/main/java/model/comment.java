package model;

import jakarta.persistence.*;

@Entity
public class comment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String content;
        @ManyToOne
        private news news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public comment(Long id, String content, model.news news) {
        this.id = id;
        this.content = content;
        this.news = news;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public model.news getNews() {
        return news;
    }

    public void setNews(model.news news) {
        this.news = news;
    }
}
