package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "answer")
@IdClass(Answer.AnswerId.class)
public class Answer {
    @Id
    @Column(name = "answer_id")
    private Integer Answer_ID;

    @Id
    @Column(name = "question_id")
    private Integer Question_ID;

    @Column(name = "sentence")
    private String Answer_Sentence;

    @Column(name = "front_score")
    private Integer Answer_Front;

    @Column(name = "back_score")
    private Integer Answer_Back;

    public static class AnswerId implements Serializable {
        private Integer Answer_ID;
        private Integer Question_ID;

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            AnswerId answerId = (AnswerId) obj;

            if (Answer_ID != null ? !Answer_ID.equals(answerId.Answer_ID) : answerId.Answer_ID != null) return false;
            return Question_ID != null ? Question_ID.equals(answerId.Question_ID) : answerId.Question_ID == null;
        }

        @Override
        public int hashCode() {
            int result = Answer_ID != null ? Answer_ID.hashCode() : 0;
            result = 31 * result + (Question_ID != null ? Question_ID.hashCode() : 0);
            return result;
        }
    }

}
