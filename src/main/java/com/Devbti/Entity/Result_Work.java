package com.Devbti.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "result_work_table")
public class Result_Work {
    @Id
    @Column(name = "Dev_Type_Code")
    private int Dev_Type_Code;

    @Id
    @Column(name = "Work_Code")
    private int Work_Code;

    private String Work_Do;
}
