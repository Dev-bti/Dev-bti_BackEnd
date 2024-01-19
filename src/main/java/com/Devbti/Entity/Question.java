package com.Devbti.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "question_table")
public class Question {
    @Id
    @Column(name = "Question_ID")
    private Integer Question_ID;
    private String Question_Sentence;
    private String Question_Image;

    /*@OneToMany(mappedBy = "Question_ID")
    private List<Answer> answer;*/
}
