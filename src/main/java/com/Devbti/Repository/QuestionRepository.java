package com.Devbti.Repository;

import com.Devbti.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Query(value = "SELECT new map(q as question_table, a as answer_table) FROM Question q LEFT JOIN Answer a ON q.Question_ID = a.Question_ID")
    List<Map<String, Object>> getQuestionandAnswer();
}
