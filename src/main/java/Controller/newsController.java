package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.*;
import model.*;

import java.util.List;

@RestController

@RequestMapping("/news")
public class newsController {
    @RestController
    @RequestMapping("/news-categories")
    public class NewsCategoryController {
        @Autowired
        private newsCategoryService newsCategoryService;

        @Autowired
        private newsService newsService;

        @GetMapping
        public List<newscategory> getAllCategories() {
            return newsCategoryService.getAllCategories();
        }


        //
        @GetMapping("/{category}")

        public String getNewsByCategory(@PathVariable newscategory category, Model model) {

            List<news> newsList = newsService.getNewsByCategory(category);

            model.addAttribute("newsList", newsList);

            return "news";

        }



    }
}
