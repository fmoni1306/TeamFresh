package com.example.demo.controller;

import com.example.demo.service.VocService;
import com.example.demo.vo.PenaltyVO;
import com.example.demo.vo.VocVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/voc")
public class VocController {

    @Autowired
    VocService vocService;

    @PostMapping
    public VocVO insertVoc(@RequestBody VocVO param) throws Exception {

        return vocService.insertVoc(param);
    }

    @PutMapping("/{vocId}")
    public boolean updateChargeCheck(@PathVariable Long vocId) throws Exception{

        return vocService.updateChargeCheck(vocId);
    }

    @PostMapping("/objection")
    public void updatePenalty(@RequestBody PenaltyVO penaltyVO) throws Exception{
        vocService.updatePenalty(penaltyVO);
    }


}
