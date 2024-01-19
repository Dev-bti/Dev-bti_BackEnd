package com.Devbti.DTO;

import lombok.Getter;

@Getter
public class QuestionDTO {
    private Integer Question_ID;
    private String Question_Sentence;
    private String Question_Image;

    public QuestionDTO(Integer Question_ID, String Question_Sentence, String Question_Image) {
        this.Question_ID = Question_ID;
        this.Question_Sentence = Question_Sentence;
        this.Question_Image = Question_Image;
    }
}
