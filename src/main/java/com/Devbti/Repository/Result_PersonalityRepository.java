package com.Devbti.Repository;

import com.Devbti.DTO.Result_PersonalityDTO;
import com.Devbti.Entity.Result_Personality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Result_PersonalityRepository extends JpaRepository<Result_Personality, Integer> {
    @Query("SELECT new com.Devbti.DTO.Result_PersonalityDTO(rp.Personality_Value) FROM Result_Personality rp WHERE rp.Dev_Type_Code = :dev_type_code")
    List<Result_PersonalityDTO> getResult_PersonalityBy(@Param("dev_type_code") Integer dev_type_code);
}
