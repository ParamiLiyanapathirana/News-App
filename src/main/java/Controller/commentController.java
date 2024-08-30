package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.*;
import service.*;
import java.util.List;


public class commentController {
    @RestController
    @RequestMapping("/comments")
    public class CommentController {
        @Autowired
        private commentService commentService;

        @GetMapping("/{news}")
        public List<comment> getCommentsByNews(@PathVariable news news) {
            return commentService.getCommentsByNews(news);
        }
    }
}
