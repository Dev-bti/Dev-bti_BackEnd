package com.Devbti.DTO;

import lombok.Getter;

import java.util.List;

@Getter
public class QuestionAndAnswerDTO {
    private List<QuestionDTO> questions;
    private List<AnswerDTO> answers;

    public QuestionAndAnswerDTO(List<QuestionDTO> questions, List<AnswerDTO> answers) {
        this.questions = questions;
        this.answers = answers;
    }
}
