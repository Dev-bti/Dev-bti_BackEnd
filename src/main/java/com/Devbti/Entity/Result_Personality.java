package com.Devbti.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "result_personality_table")
public class Result_Personality {
    @Id
    @Column(name = "Dev_Type_Code")
    private Integer Dev_Type_Code;

    @Id
    @Column(name = "Personality_Code")
    private Integer Personality_Code;

    private String Personality_Value;
}
