package com.Devbti.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "result_language_table")
public class Result_Language {
    @Id
    @Column(name = "Dev_Type_Code")
    private int Dev_Type_Code;

    @Id
    @Column(name = "Language_Code")
    private int Language_Code;

    private String Language_Name;

}
