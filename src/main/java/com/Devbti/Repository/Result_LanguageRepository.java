package com.Devbti.Repository;

import com.Devbti.Entity.Result_Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface Result_LanguageRepository extends JpaRepository<Result_Language, Integer> {
    @Query("SELECT new com.Devbti.DTO.Result_LanguageDTO(rl.Language_Name) FROM Result_Language rl WHERE rl.Dev_Type_Code = :dev_type_code")
    ArrayList<String> getResult_LanguageBy(@Param("dev_type_code") Integer dev_type_code);
}
