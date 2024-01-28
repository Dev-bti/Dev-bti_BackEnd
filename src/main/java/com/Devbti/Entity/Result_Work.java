package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

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

    public static class Result_WorkId implements Serializable {
        private Integer Dev_Type_Code;
        private Integer Work_Code;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Result_WorkId that = (Result_WorkId) o;
            return Objects.equals(Dev_Type_Code, that.Dev_Type_Code) &&
                    Objects.equals(Work_Code, that.Work_Code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(Dev_Type_Code, Work_Code);
        }
    }
}
