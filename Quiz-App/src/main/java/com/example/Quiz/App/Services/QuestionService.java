package com.example.Quiz.App.Services;

import com.example.Quiz.App.Model.Question;
import com.example.Quiz.App.Repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuizRepo quizRepo;

    public List<Question> questionsAdd(List<Question> question) {
        return quizRepo.saveAll(question);
    }

    public List<Question> questionGet() {
        return quizRepo.findAll();
    }
}
