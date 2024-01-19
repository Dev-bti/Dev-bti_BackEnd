package com.Devbti.Service;

import com.Devbti.DTO.QuestionDTO;
import com.Devbti.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerService answerService;

    public List<QuestionDTO> getQuestions() {
        return questionRepository.getQuestions();
    }
}
