package com.Devbti.Repository;

import com.Devbti.DTO.QuestionDTO;
import com.Devbti.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    //되는거
    @Query("SELECT new com.Devbti.DTO.QuestionDTO(q.Question_ID, q.Question_Sentence, q.Question_Image) FROM Question q")
    List<QuestionDTO> getQuestions();
}
