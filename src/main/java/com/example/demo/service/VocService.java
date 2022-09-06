package com.example.demo.service;

import com.example.demo.mapper.VocMapper;
import com.example.demo.vo.CompensationVO;
import com.example.demo.vo.ObjectionVO;
import com.example.demo.vo.PenaltyVO;
import com.example.demo.vo.VocVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class VocService {

    @Autowired
    VocMapper vocMapper;

    public String insertVoc(VocVO param) {

        String response = "fail";

        try {
            Integer result = vocMapper.insertVoc(param);
            CompensationVO compensation = param.getCompensation();
            compensation.setVocNo(param.getVocNo());

            vocMapper.insertCompensation(compensation);
            PenaltyVO penalty = compensation.getPenalty();
            penalty.setCompensationNo(compensation.getCompensationNo());
            vocMapper.insertPenalty(penalty);

            if (result > 0) {
                response = "success";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return response;
    }

    public List<VocVO> selectVocList(Long chargerNo) {
        List<VocVO> vocList = new ArrayList<>();
        try {
            vocList = vocMapper.selectVocList(chargerNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vocList;
    }

    public void updateCheckCompensation() {
    }

    public void updateCheckVoc(Long vocNo) {

        try {
            vocMapper.updateCheckVoc(vocNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateChargerSign(Long penaltyNo) {
        try {
            vocMapper.updateChargerSign(penaltyNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertObjection(ObjectionVO objection) {
        try {
            vocMapper.insertObjection(objection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
