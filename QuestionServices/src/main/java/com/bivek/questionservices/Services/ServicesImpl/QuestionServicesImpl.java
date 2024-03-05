package com.bivek.questionservices.Services.ServicesImpl;

import com.bivek.questionservices.Entities.Question;
import com.bivek.questionservices.Repository.QuestionRepository;
import com.bivek.questionservices.Services.QuestionServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServicesImpl implements QuestionServices {
    private QuestionRepository questionRepository;

    public QuestionServicesImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> getQuestionsByQuizId(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
