package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "result_personality_table")
@IdClass(Result_Personality.Result_PersonalityId.class)
public class Result_Personality {
    @Id
    @Column(name = "Dev_Type_Code")
    private Integer Dev_Type_Code;

    @Id
    @Column(name = "Personality_Code")
    private Integer Personality_Code;

    private String Personality_Value;

    public class Result_PersonalityId implements Serializable{
        private Integer Dev_Type_Code;
        private Integer Personality_Code;
    }
}
