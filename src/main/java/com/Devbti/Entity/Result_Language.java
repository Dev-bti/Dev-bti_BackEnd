package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "result_language_table")
@IdClass(Result_Language.Result_LanguageId.class)
public class Result_Language {
    @Id
    @Column(name = "Dev_Type_Code")
    private Integer Dev_Type_Code;

    @Id
    @Column(name = "Language_Code")
    private Integer Language_Code;

    private String Language_Name;

    public class Result_LanguageId implements Serializable {
        private Integer Dev_Type_Code;
        private Integer Language_Code;
    }
}
