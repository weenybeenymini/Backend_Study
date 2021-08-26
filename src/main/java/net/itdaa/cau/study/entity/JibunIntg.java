package net.itdaa.cau.study.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * JPA 에서 Entity 객체는 사용하는 DB 의 Table 과 구조가 같아야 합니다.
 */

//테이블과 링크될 클래스임을 나타냄 도메인 느낌 테이블을 객체화 한거
@Entity
@Data
@IdClass(JibunIntg.class)
@Table(name="JIBUN")
public class JibunIntg implements Serializable {

    @Id
    @Column(name = "mgr_no")
    private String mgrNo;                 // 관리번호 (PK)

    @Id
    @Column(name = "seq_no")
    private Integer seqNo;                // 순서 (PK)

    @Column(name = "regn_code")
    private String regnCode;

    @Column(name = "sido_name")
    private String sidoName;              // 시도명

    @Column(name = "sigungu_name")
    private String sigunguName;           // 시군구명

    @Column(name = "umd_name")
    private String umdName;                 // 읍면동명

    @Column(name = "ri_name")
    private String riName;

    @Column(name = "san_yn")
    private Integer sanYu;              // 산여부

    @Column(name = "jibn_main_no")
    private Integer jibnMainNo;            // 지번본번

    @Column(name = "jibn_sub_no")
    private Integer jibnSubNo;            // 지번부번

    @Column(name = "pres_yn")
    private Integer pres_yn;             // 대표 여부
}
