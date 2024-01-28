package com.Devbti.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Result_TypeDTO {
    private Integer Dev_Type_Code;
    private String Dev_Type;
    private String Dev_Adjective;
    private List<String> Dev_Personalities;
    private List<String> Dev_Works;
    private List<String> Dev_Languages;

    public void setDev_Personalities(ArrayList<String> Dev_Personalities) {
        this.Dev_Personalities = Dev_Personalities;
    }

    public void setDev_Works(ArrayList<String> Dev_Works) {
        this.Dev_Works = Dev_Works;
    }

    public void setDev_Languages(ArrayList<String> Dev_Languages) {
        this.Dev_Languages = Dev_Languages;
    }

    public Result_TypeDTO(Integer Dev_Type_Code, String Dev_Type, String Dev_Adjective) {
        this.Dev_Type_Code = Dev_Type_Code;
        this.Dev_Type = Dev_Type;
        this.Dev_Adjective = Dev_Adjective;
    }
}
