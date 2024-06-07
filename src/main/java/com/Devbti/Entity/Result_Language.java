package com.Devbti.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "result_language")
@IdClass(Result_Language.Result_LanguageId.class)
public class Result_Language {
    @Id
    @Column(name = "dev_type_code")
    private Integer Dev_Type_Code;

    @Id
    @Column(name = "language_code")
    private Integer Language_Code;

    @Column(name = "language")
    private String Language_Name;

    public static class Result_LanguageId implements Serializable {
        private Integer Dev_Type_Code;
        private Integer Language_Code;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Result_LanguageId that = (Result_LanguageId) o;
            return Objects.equals(Dev_Type_Code, that.Dev_Type_Code) &&
                    Objects.equals(Language_Code, that.Language_Code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(Dev_Type_Code, Language_Code);
        }
    }
}
