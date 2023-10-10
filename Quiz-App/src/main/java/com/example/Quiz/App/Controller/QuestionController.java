package com.example.Quiz.App.Controller;

import com.example.Quiz.App.Model.Question;
import com.example.Quiz.App.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @PostMapping("add")
    public List<Question> questionsAdd(@RequestBody List<Question> question) {
        return questionService.questionsAdd(question);
    }

    @GetMapping("get")
    public List<Question> questionGet() {
        return questionService.questionGet();
    }
}


