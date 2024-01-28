package com.Devbti.DTO;

import lombok.Getter;

@Getter
public class Result_LanguageDTO {
    private String Language_Name;

    public Result_LanguageDTO(String Language_Name) {
        this.Language_Name = Language_Name;
    }

    @Override
    public String toString() {
        return Language_Name;
    }
}
