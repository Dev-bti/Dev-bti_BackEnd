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
    private int Dev_Type_Code;

    @Id
    @Column(name = "Personality_Code")
    private int Personality_Code;

    private String Personality_Value;
}
