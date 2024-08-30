package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.*;
import repository.*;
import java.util.List;

@Service
public class newsCategoryService {

        @Autowired
        private newsCategoryRepository newsCategoryRepository;

        public List<newscategory> getAllCategories() {
            return newsCategoryRepository.findAll();
        }

}
