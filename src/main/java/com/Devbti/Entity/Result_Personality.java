package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "result_personality")
@IdClass(Result_Personality.Result_PersonalityId.class)
public class Result_Personality {
    @Id
    @Column(name = "dev_type_code")
    private Integer Dev_Type_Code;

    @Id
    @Column(name = "personality")
    private Integer Personality_Code;

    @Column(name = "value")
    private String Personality_Value;

    public static class Result_PersonalityId implements Serializable{
        private Integer Dev_Type_Code;
        private Integer Personality_Code;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Result_PersonalityId that = (Result_PersonalityId) o;
            return Objects.equals(Dev_Type_Code, that.Dev_Type_Code) &&
                    Objects.equals(Personality_Code, that.Personality_Code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(Dev_Type_Code, Personality_Code);
        }
    }
}
