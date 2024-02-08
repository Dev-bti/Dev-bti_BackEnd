package com.Devbti.DTO;

import lombok.Getter;

@Getter
public class Result_LectureDTO {
    private String Lecture_URL;

    public Result_LectureDTO(String Lecture_URL) {
        this.Lecture_URL = Lecture_URL;
    }

    @Override
    public String toString() {
        return Lecture_URL;
    }

}
