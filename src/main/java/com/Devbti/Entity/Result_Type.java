package com.Devbti.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "result_type")
public class Result_Type {
    @Id
    @Column(name = "dev_type_code")
    private Integer Dev_Type_Code;

    @Column(name = "type")
    private String Dev_Type;

    @Column(name = "adjective")
    private String Dev_Adjective;
}
