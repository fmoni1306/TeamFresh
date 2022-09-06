package com.example.demo.service;

import com.example.demo.mapper.PenaltyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenaltyService {

    @Autowired
    PenaltyMapper penaltyMapper;

    public void selectChargerSalary(Long chargerNo) {

        try {
            penaltyMapper.selectChargerSalary(chargerNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
