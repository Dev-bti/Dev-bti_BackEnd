package com.Devbti.Service;

import com.Devbti.DTO.Result_TypeDTO;
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
    private Result_WorkRepository resultWorkRepository;

    public List<Result_TypeDTO> getResult(Integer Dev_Type_Code) {
        List<Result_TypeDTO> result = new ArrayList<>();
        return result;
    }



}
