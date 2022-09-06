package com.example.demo.mapper;

import com.example.demo.vo.CompensationVO;
import com.example.demo.vo.ObjectionVO;
import com.example.demo.vo.PenaltyVO;
import com.example.demo.vo.VocVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface VocMapper {

    public Integer insertVoc(VocVO voc) throws Exception;

    public void insertCompensation(CompensationVO compensation) throws Exception;

    public void insertPenalty(PenaltyVO penalty) throws Exception;

    public List<VocVO> selectVocList(Long chargerNo) throws Exception;

    public void updateCheckVoc(Long vocNo) throws Exception;

    public void updateChargerSign(Long penaltyNo) throws Exception;

    public void insertObjection(ObjectionVO objection) throws Exception;
}
