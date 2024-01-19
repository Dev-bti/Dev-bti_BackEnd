package com.Devbti.DTO;

public class AnswerDTO {
    private Integer Answer_ID;
    private Integer Question_ID;
    private String Answer_Sentence;
    private Integer Answer_Front;
    private Integer Answer_Back;

    public AnswerDTO(Integer Answer_ID, Integer Question_ID, String Answer_Sentence, Integer Answer_Front, Integer Answer_Back) {
        this.Answer_ID = Answer_ID;
        this.Question_ID = Question_ID;
        this.Answer_Sentence = Answer_Sentence;
        this.Answer_Front = Answer_Front;
        this.Answer_Back = Answer_Back;
    }
}
