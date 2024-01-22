package com.Devbti.Repository;

import com.Devbti.DTO.AnswerDTO;
import com.Devbti.Entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    @Query("SELECT new com.Devbti.DTO.AnswerDTO(a.Answer_ID, a.Question_ID, a.Answer_Sentence, a.Answer_Front, a.Answer_Back) FROM Answer a WHERE a.Question_ID = :questionId")
    List<AnswerDTO> getAnswersForQuestion(@Param("questionId") Integer questionId);
}
