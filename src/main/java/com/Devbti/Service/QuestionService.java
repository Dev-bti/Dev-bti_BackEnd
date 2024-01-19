package com.Devbti.Service;

import com.Devbti.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Map<String, Object>> getQuestionandAnswer() {
        return questionRepository.getQuestionandAnswer();
    }
}
