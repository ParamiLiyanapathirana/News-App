package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.*;
import repository.*;

import java.util.List;


@Service
public class commentService {
    @Autowired
    private commentRepository commentRepository;



    public List<comment> getCommentsByNews(news news) {

        return commentRepository.findByNews(news);

    }
}
