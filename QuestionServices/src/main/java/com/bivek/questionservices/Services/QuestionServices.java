package com.bivek.questionservices.Services;

import com.bivek.questionservices.Entities.Question;

import java.util.List;

public interface QuestionServices {
    Question addQuestion(Question question);

    List<Question> getAllQuestions();

    Question getQuestionById(Long questionId);

    List<Question> getQuestionsByQuizId(Long quizId);
}
