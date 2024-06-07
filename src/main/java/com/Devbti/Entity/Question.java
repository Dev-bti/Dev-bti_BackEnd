package com.Devbti.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "question_id")
    private Integer Question_ID;

    @Column(name = "sentence")
    private String Question_Sentence;

    @Column(name = "image")
    private String Question_Image;
}
