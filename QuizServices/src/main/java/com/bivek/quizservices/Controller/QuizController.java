package com.bivek.quizservices.Controller;

import com.bivek.quizservices.Entities.Quiz;
import com.bivek.quizservices.Services.QuizServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizServices quizServices;

    public QuizController(QuizServices quizServices) {
        this.quizServices = quizServices;
    }

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizServices.addQuiz(quiz);
    }

    @GetMapping
    public List<Quiz> getQuizzes() {
        return quizServices.getQuizzes();
    }

    @GetMapping("/{quizId}")

    public Quiz getQuizServicesById(@PathVariable Long quizId) {
        return quizServices.getQuizById(quizId);

    }
}
