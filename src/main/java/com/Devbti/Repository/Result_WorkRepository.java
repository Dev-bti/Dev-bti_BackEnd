package com.Devbti.Repository;

import com.Devbti.DTO.Result_WorkDTO;
import com.Devbti.Entity.Result_Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Result_WorkRepository extends JpaRepository<Result_Work, Integer> {
    @Query("SELECT new com.Devbti.DTO.Result_WorkDTO(wr.Work_Do) FROM Result_Work wr WHERE wr.Dev_Type_Code = :dev_type_code")
    List<Result_WorkDTO> getResult_WorkBy(@Param("dev_type_code") Integer dev_type_code);
}
