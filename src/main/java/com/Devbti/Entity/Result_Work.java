package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "result_work_table")
@IdClass(Result_Work.Result_WorkId.class)
public class Result_Work {
    @Id
    @Column(name = "Dev_Type_Code")
    private Integer Dev_Type_Code;

    @Id
    @Column(name = "Work_Code")
    private Integer Work_Code;

    private String Work_Do;

    public class Result_WorkId implements Serializable {
        private Integer Dev_Type_Code;
        private Integer Work_Code;
    }
}
