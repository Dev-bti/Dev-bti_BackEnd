package com.Devbti.DTO;

import lombok.Getter;

@Getter
public class Result_PersonalityDTO {
    private String Personality_Value;

    public Result_PersonalityDTO(String Personality_Value) {
        this.Personality_Value = Personality_Value;
    }

    @Override
    public String toString() {
        return Personality_Value;
    }
}
