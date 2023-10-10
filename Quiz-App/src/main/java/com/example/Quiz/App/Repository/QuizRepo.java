package com.example.Quiz.App.Repository;

import com.example.Quiz.App.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepo extends JpaRepository<Question,Integer> {
}
