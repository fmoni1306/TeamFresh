package com.example.demo.mapper;

import com.example.demo.vo.ClaimImgVO;
import com.example.demo.vo.ClaimVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClaimMapper {
    public Integer insertClaim(ClaimVO claimVO) throws Exception;

    public void insertClaimImg(@Param("claimNo") Long claimNo, @Param("claimImgList") List<ClaimImgVO> claimImgList) throws Exception;

    public List<ClaimVO> selectClaim() throws Exception;

    public Integer updateClaimCheck(ClaimVO checkYn) throws Exception;
}
