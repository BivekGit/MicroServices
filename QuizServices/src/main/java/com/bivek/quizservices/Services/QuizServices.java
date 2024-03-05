package com.bivek.quizservices.Services;

import com.bivek.quizservices.Entities.Quiz;

import java.util.List;

public interface QuizServices {
    Quiz addQuiz(Quiz quiz);

    List<Quiz> getQuizzes();

    Quiz getQuizById(Long quizId);
}
