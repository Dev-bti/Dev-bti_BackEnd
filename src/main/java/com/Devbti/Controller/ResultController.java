package com.Devbti.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/result")
public class ResultController {

    @GetMapping
    public ResponseEntity<List<>> getResult(@RequestParam int Front, int Back) {

    }
}
