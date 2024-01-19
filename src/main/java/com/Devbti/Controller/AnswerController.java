package com.Devbti.Controller;

import com.Devbti.DTO.AnswerDTO;
import com.Devbti.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question1")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping
    public ResponseEntity<List<AnswerDTO>> getQuestion() {
        List<AnswerDTO> result = answerService.getAnswers();
        return ResponseEntity.ok(result);
    }
}
