package com.Devbti.Repository;

import com.Devbti.DTO.Result_TypeDTO;
import com.Devbti.Entity.Result_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Result_TypeRepository extends JpaRepository<Result_Type, Integer> {
    @Query("SELECT new com.Devbti.DTO.Result_TypeDTO(rt.Dev_Type_Code, rt.Dev_Type, rt.Dev_Adjective) FROM Result_Type rt WHERE rt.Dev_Type_Code = :dev_type_code")
    List<Result_TypeDTO> getResult_TypeBy(@Param("dev_type_code") Integer dev_type_code);
}
