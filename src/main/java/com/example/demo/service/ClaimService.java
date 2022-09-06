package com.example.demo.service;

import com.example.demo.mapper.ClaimMapper;
import com.example.demo.vo.ClaimVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClaimService {

    @Autowired
    ClaimMapper claimMapper;

    public String insertClaim(ClaimVO claimVO) {
        String response = "fail";
        try {
            Integer result = claimMapper.insertClaim(claimVO);

            claimMapper.insertClaimImg(claimVO.getClaimNo(), claimVO.getClaimImgList());

            if (result > 0) {
                response =  "success";
            } else {
                throw new SQLSyntaxErrorException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    public List<ClaimVO> selectClaim() {
        List<ClaimVO> result = new ArrayList<>();
        try {
            result = claimMapper.selectClaim();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public String updateClaimCheck(ClaimVO claimVo) {
        /**
         *  TODO: Manager 검증
         */
        String response = "fail";
        try {
            Integer result = claimMapper.updateClaimCheck(claimVo);
            if (result > 0) {
                response = "success";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }
}
