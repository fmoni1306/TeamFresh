package com.example.demo.controller;

import com.example.demo.service.VocService;
import com.example.demo.vo.ObjectionVO;
import com.example.demo.vo.VocVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/voc")
public class VocController {

    @Autowired
    VocService vocService;

    @PostMapping
    public String insertVoc(@RequestBody VocVO param) {
        return vocService.insertVoc(param);
    }

    @GetMapping("/{chargerNo}")
    public List<VocVO> selectVoc(@PathVariable("chargerNo") Long chargerNo) {
        return vocService.selectVocList(chargerNo);
    }

    @PutMapping("/check/{vocNo}")
    public void updateCheck(@PathVariable("vocNo") Long vocNo) {
        // 기사 배상정보 확인 = Y
        vocService.updateCheckVoc(vocNo);
    }

    @PutMapping("/sign/{penaltyNo}")
    public void updateSign(@PathVariable("penaltyNo") Long penaltyNo) {
        // 기사 배상정보 사인 = Y
        vocService.updateChargerSign(penaltyNo);
    }

    @PostMapping("/objection")
    public void insertObjection(@RequestBody ObjectionVO objection) {
        vocService.insertObjection(objection);
    }
}
