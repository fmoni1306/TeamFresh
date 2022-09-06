package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor
@AllArgsConstructor
@Alias("penaltyVO")
@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PenaltyVO {

    private Long penaltyNo;

    private Integer claimNo;

    private String penaltyContent;

    private String penaltyType;

    private Long compensationNo;

    private ObjectionVO objection;
}
