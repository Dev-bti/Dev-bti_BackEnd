package com.Devbti.DTO;

import lombok.Getter;

@Getter
public class Result_WorkDTO {
    private String Work_Do;

    public Result_WorkDTO(String Work_Do) {
        this.Work_Do = Work_Do;
    }
}
