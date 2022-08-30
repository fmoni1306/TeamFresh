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

    private Long id;

    private Long compensation;

    private String content;

    private String penaltyType;

    private String isConfirmPenalty;

    private Integer price;

    private String objectionYn;

    private ObjectionVO objection;

}
