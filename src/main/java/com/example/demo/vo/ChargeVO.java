package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("chargeVO")
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChargeVO {
    private Long chargerNo;

    private String chargerType;

    private String chargerNm;

    private String chargerTel;

    private Integer salary;

    private Integer penaltyPrice;
}
