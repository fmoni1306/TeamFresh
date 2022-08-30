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

    private Long id;

    private TARGET target;

    private String content;

    private String checkYn;

    private Long companyId;

    private CompensationVO compensation;

    private CompanyVO company;

    public enum TARGET {
        DELIVERY, CUSTOMER
    }
}
