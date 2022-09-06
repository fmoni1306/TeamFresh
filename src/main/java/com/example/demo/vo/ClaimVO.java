package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Alias("claimVO")
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClaimVO {

    private Long claimNo;

    private String claimContent;

    private Long companyNo;

    private Long memberNo;

    private String managerCheckYn;

    private List<ClaimImgVO> claimImgList;

    private TeamFreshMemberVO teamFreshMember;
}
