package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor
@AllArgsConstructor
@Alias("compensationVO")
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompensationVO {

    private Long compensationNo;

    private Integer compensationPrice;

    private String compensationSign;

    private Long vocNo;

    private PenaltyVO penalty;

}
