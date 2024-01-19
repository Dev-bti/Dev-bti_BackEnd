package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "answer_table")
@IdClass(Answer.AnswerId.class)
public class Answer {
    @Id
    @Column(name = "Answer_ID")
    private Integer Answer_ID;
/*    @ManyToOne
    @JoinColumn(name = "Question_ID")*/
    @Id
    @Column(name = "Question_ID")
    private Integer Question_ID;
    private String Answer_Sentence;
    private Integer Answer_Front;
    private Integer Answer_Back;

    public static class AnswerId implements Serializable {
        private Integer Answer_ID;
        private Integer Question_ID;
    }
}
