package com.Devbti.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer_table")
public class Answer {
    @Id
    private Integer Answer_ID;
/*    @ManyToOne
    @JoinColumn(name = "Question_ID")*/
    private Integer Question_ID;
    private String Answer_Sentence;
    private Integer Answer_Front;
    private Integer Answer_Back;
}
