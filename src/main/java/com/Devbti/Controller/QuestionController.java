package com.Devbti.Controller;

import com.Devbti.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> getQuestionandAnswer() {
        List<Map<String, Object>> result = questionService.getQuestionandAnswer();
        return ResponseEntity.ok(result);
    }
}
