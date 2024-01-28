package com.Devbti.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "result_type_table")
public class Result_Type {
    @Id
    @Column(name = "Dev_Type_Code")
    private Integer Dev_Type_Code;

    private String Dev_Type;

    private String Dev_Adjective;
}
