package com.Devbti.Controller;

import com.Devbti.DTO.Result_TypeDTO;
import com.Devbti.Service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin("*")
@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService resultService;

    private Integer devType;
    @GetMapping
    public ResponseEntity<List<Result_TypeDTO>> getResult(@RequestParam(value = "frontScore") int frontScore, @RequestParam(value = "backScore") int backScore) {
        if(frontScore >= backScore) {
            if((frontScore - backScore) <= 10) devType = 0;
            else devType = 1;
        } else {
            if((backScore - frontScore) <= 10) devType = 0;
            else devType = 2;
        }

        List<Result_TypeDTO> result = resultService.getResult(devType);
        return ResponseEntity.ok(result);
    }
}
