package com.example.demo.service;

import com.example.demo.mapper.VocMapper;
import com.example.demo.vo.CompensationVO;
import com.example.demo.vo.PenaltyVO;
import com.example.demo.vo.VocVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VocService {

    @Autowired
    VocMapper vocMapper;

    public VocVO insertVoc(VocVO param) throws Exception {

        vocMapper.insertVoc(param);

        CompensationVO compensation = param.getCompensation();

        compensation.setVoc(param.getId());

        vocMapper.insertCompensation(compensation);

        PenaltyVO penalty = param.getCompensation().getPenalty();

        penalty.setCompensation(compensation.getId());

        vocMapper.insertPenalty(penalty);

        VocVO vocResult = vocMapper.selectVoc(param.getId());


        return vocResult;
    }

    public boolean updateChargeCheck(Long vocId) throws Exception{
        VocVO vocVO = vocMapper.selectVoc(vocId);

        Integer integer = vocMapper.updateChargeCheck(vocId);

        if (integer > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void updatePenalty(PenaltyVO penaltyVO) throws Exception {
        if (penaltyVO.getObjectionYn().equals("Y")) {
            vocMapper.updatePenalty(penaltyVO);

            penaltyVO.getObjection().setPenalty(penaltyVO.getId());

            vocMapper.insertObjection(penaltyVO.getObjection());
        }
    }
}
