package com.example.demo.controller;

import com.example.demo.service.ClaimService;
import com.example.demo.vo.ClaimVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/claim")
public class ClaimController {

    @Autowired
    ClaimService claimService;

    @PostMapping
    public String insertClaim(@RequestBody ClaimVO claimVO) {
        return claimService.insertClaim(claimVO);
    }

    @GetMapping
    public List<ClaimVO> selectClaim() {
        return claimService.selectClaim();
    }

    @PutMapping
    public String updateClaimCheck(@RequestBody ClaimVO claimVO) {
        return claimService.updateClaimCheck(claimVO);
    }
}
