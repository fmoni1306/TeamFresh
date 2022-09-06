package com.example.demo.controller;

import com.example.demo.service.PenaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/penalty")
public class PenaltyController {

    @Autowired
    PenaltyService penaltyService;

    @GetMapping("/{chargerNo}")
    public Integer selectChargerSalary(@PathVariable("chargerNo") Long chargerNo) {
        penaltyService.selectChargerSalary(chargerNo);

        return 10;
    }
}
