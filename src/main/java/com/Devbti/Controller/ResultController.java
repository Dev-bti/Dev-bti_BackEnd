package com.Devbti.Controller;

import com.Devbti.Service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService resultService;

    private int devType;
    @GetMapping
    public ResponseEntity<List<>> getResult(@RequestParam int frontScore, int backScore) {

    }

    /*@GetMapping
    public int isit(@RequestParam int frontScore, int backScore) {
        return frontScore + backScore;
    }*/
}
