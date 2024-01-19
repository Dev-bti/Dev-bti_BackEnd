package com.Devbti.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "question_table")
public class Question {
    @Id
    private Integer Question_ID;
    private String Question_Sentence;
    private String Question_Image;

    @OneToMany(mappedBy = "Question_ID")
    private List<Answer> answer;
}
