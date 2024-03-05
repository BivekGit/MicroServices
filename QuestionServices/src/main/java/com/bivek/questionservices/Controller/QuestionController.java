package com.bivek.questionservices.Controller;

import com.bivek.questionservices.Entities.Question;
import com.bivek.questionservices.Services.QuestionServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionServices questionServices;

    public QuestionController(QuestionServices questionServices) {
        this.questionServices = questionServices;
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        return questionServices.addQuestion(question);
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionServices.getAllQuestions();
    }

    @GetMapping("/{questionId}")
    public Question getQuestionById(@PathVariable Long questionId) {
        return questionServices.getQuestionById(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long quizId) {
        return questionServices.getQuestionsByQuizId(quizId);
    }
}
