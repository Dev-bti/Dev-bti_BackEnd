package com.Devbti.Service;

import com.Devbti.DTO.AnswerDTO;
import com.Devbti.Repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;
    public List<AnswerDTO> getAnswers() {
        return answerRepository.getAnswers();
        //return questionRepository.findAll();
    }
}
