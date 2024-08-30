package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import model.news;
import model.newscategory;
import repository.*;

import java.util.List;
import java.util.Optional;

@Service
public class newsService {
    @Autowired

    private newsrepository newsRepository;

    @Autowired
    private newsCategoryRepository newsCategoryRepository;



    public List<news> getNewsByCategory(newscategory category) {

        return newsRepository.findByCategories(category);

    }



    public List<newscategory> getAllCategories() {

        return newsCategoryRepository.findAll();

    }

    @GetMapping("/{id}")

    public String getNewsById(@PathVariable Long id, Model model) {

        Optional<news> news = newsService.getNewsById(id);

        if (news.isPresent()) {

            model.addAttribute("news", news.get());

            return "news";

        } else {

            return "news-not-found";

        }

    }
}
