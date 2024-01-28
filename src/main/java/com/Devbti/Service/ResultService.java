package com.Devbti.Service;

import com.Devbti.DTO.Result_TypeDTO;
import com.Devbti.Repository.Result_LanguageRepository;
import com.Devbti.Repository.Result_PersonalityRepository;
import com.Devbti.Repository.Result_TypeRepository;
import com.Devbti.Repository.Result_WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ResultService {

    @Autowired
    private Result_TypeRepository resultTypeRepository;

    @Autowired
    private Result_PersonalityRepository resultPersonalityRepository;

    @Autowired
    private Result_WorkRepository resultworkRepository;

    @Autowired
    private Result_LanguageRepository resultLanguageRepository;

    public List<Result_TypeDTO> getResult(Integer Dev_Type_Code) {
        List<Result_TypeDTO> result = new ArrayList<>();

        Result_TypeDTO resultType = resultTypeRepository.getResult_TypeBy(Dev_Type_Code);
        resultType.setDev_Personalities(resultPersonalityRepository.getResult_PersonalityBy(Dev_Type_Code));
        resultType.setDev_Works(resultworkRepository.getResult_WorkBy(Dev_Type_Code));
        resultType.setDev_Languages(resultLanguageRepository.getResult_LanguageBy(Dev_Type_Code));
        result.add(resultType);

        return result;
    }



}
