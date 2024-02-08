package com.Devbti.Repository;

import com.Devbti.Entity.Result_Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface Result_LectureRepository extends JpaRepository<Result_Lecture, Integer> {
    @Query("SELECT new com.Devbti.DTO.Result_LectureDTO(rl.Lecture_URL) FROM Result_Lecture rl WHERE rl.Dev_Type_Code = :dev_type_code")
    ArrayList<String> getResult_LectureBy(@Param("dev_type_code") Integer dev_type_code);
}
