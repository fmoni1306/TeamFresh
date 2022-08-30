package com.example.demo.mapper;

import com.example.demo.vo.CompensationVO;
import com.example.demo.vo.ObjectionVO;
import com.example.demo.vo.PenaltyVO;
import com.example.demo.vo.VocVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface VocMapper {

    public void insertVoc(VocVO voc) throws Exception;

    public void insertCompensation(CompensationVO compensation) throws Exception;

    public void insertPenalty(PenaltyVO penalty) throws Exception;

    public VocVO selectVoc(Long id) throws Exception;

    public Integer updateChargeCheck(Long vocId) throws Exception;

    public void updatePenalty(PenaltyVO penaltyVO) throws Exception;

    public void insertObjection(ObjectionVO objectionVO) throws Exception;
}
