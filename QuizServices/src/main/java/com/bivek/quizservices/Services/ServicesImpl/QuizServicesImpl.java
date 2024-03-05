package com.bivek.quizservices.Services.ServicesImpl;

import com.bivek.quizservices.Entities.Quiz;
import com.bivek.quizservices.Services.QuestionClient;
import com.bivek.quizservices.Services.QuizServices;
import org.springframework.stereotype.Service;
import com.bivek.quizservices.Repository.QuizRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServicesImpl implements QuizServices {

    private QuizRepository quizRepository;
    private QuestionClient questionClient;


    public QuizServicesImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getQuizzes() {
        List<Quiz> quizList = quizRepository.findAll();
        List<Quiz> newQuizList = quizList.stream()
                .peek(quiz -> quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getQuizId())))
                .toList();
        return newQuizList;
    }


    @Override
    public Quiz getQuizById(Long quizId) {
        Quiz quiz = quizRepository.findById(quizId).orElseThrow(() -> new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getQuizId()));
        return quiz;
    }
}
