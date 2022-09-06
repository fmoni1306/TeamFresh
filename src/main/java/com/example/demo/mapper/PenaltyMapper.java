package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PenaltyMapper {
    public Integer selectChargerSalary(Long chargerNo) throws Exception;
}
