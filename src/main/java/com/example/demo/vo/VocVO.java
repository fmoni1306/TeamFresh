package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor
@AllArgsConstructor
@Alias("vocVO")
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VocVO {

    private Long vocNo;

    private Long claimNo;

    private CompanyVO delivery;

    private CompanyVO customer;

    private TARGET vocTarget;

    private String vocContent;

    private String ChargerCheckYn;

    private CompensationVO compensation;

    public enum TARGET {
        DELIVERY, CUSTOMER
    }
}
