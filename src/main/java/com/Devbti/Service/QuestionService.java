package com.Devbti.Service;

import com.Devbti.DTO.AnswerDTO;
import com.Devbti.DTO.QuestionDTO;
import com.Devbti.Repository.AnswerRepository;
import com.Devbti.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired

    private AnswerRepository answerRepository;

    public List<QuestionDTO> getQuestions() {
        List<QuestionDTO> result = new ArrayList<>();
        List<QuestionDTO> questions = questionRepository.getQuestions();

        for (QuestionDTO question : questions) {
            List<AnswerDTO> answers = answerRepository.getAnswersForQuestion(question.getQuestion_ID());
            question.setAnswers(answers);
            result.add(question);
        }
        return result;
    }
}
