package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.*;
import service.*;

import java.util.List;

@RestController

@RequestMapping("/news-categories")
public class newscategoryController {
    @Autowired

    private newsCategoryService newsCategoryService;



    @GetMapping

    public List<newscategory> getAllCategories() {

        return newsCategoryService.getAllCategories();

    }
}
