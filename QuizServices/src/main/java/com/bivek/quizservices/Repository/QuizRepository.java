package com.bivek.quizservices.Repository;

import com.bivek.quizservices.Entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
