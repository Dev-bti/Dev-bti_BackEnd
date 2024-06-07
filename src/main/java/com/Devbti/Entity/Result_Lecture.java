package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "result_lecture")
@IdClass(Result_Lecture.Result_LectureId.class)
public class Result_Lecture {
    @Id
    @Column(name = "dev_type_code")
    private Integer Dev_Type_Code;

    @Id
    @Column(name = "lecture")
    private Integer Lecture_Code;

    @Column(name = "url")
    private String Lecture_URL;

    public static class Result_LectureId implements Serializable {
        private Integer Dev_Type_Code;
        private Integer Lecture_Code;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Result_LectureId that = (Result_LectureId) o;
            return Objects.equals(Dev_Type_Code, that.Dev_Type_Code) &&
                    Objects.equals(Lecture_Code, that.Lecture_Code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(Dev_Type_Code, Lecture_Code);
        }
    }
}
