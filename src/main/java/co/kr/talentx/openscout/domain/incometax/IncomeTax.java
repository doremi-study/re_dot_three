package co.kr.talentx.openscout.domain.incometax;

import co.kr.talentx.openscout.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
public class IncomeTax {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name; //이름
    private String resdNum; //주민등록번호
    private LocalDate birthDt; //생년월일
    @Enumerated(EnumType.STRING)
    private IncomeKind incomeKind; //소득구분
    private long totalAmt; //총지급액
    private BigDecimal incomeTaxRate; //소득세율
    private long incomeTaxAmt; // 소득세
    private long actualAmt; // 실지급액
    private String companyName; //기업명
    private String bizNum; // 사업자번호
    private LocalDate payDt; //지급일
    private String incomeContents; // 소득내역
    private LocalDate workStartDt; // 업무시작일
    private LocalDate workEndDt; // 업무 종료일
    private int deliveryStandard; //납기준수
    private int workQa; //업무 품질
    private int satisfaction; //만족도
    private BigDecimal totalGrade; // 전체평점

    @Builder
    public IncomeTax(Long id, String name, String resdNum, LocalDate birthDt, IncomeKind incomeKind, long totalAmt, BigDecimal incomeTaxRate, long incomeTaxAmt, long actualAmt, String companyName, String bizNum, LocalDate payDt, String incomeContents, LocalDate workStartDt, LocalDate workEndDt, int deliveryStandard, int workQa, int satisfaction, BigDecimal totalGrade) {
        this.id = id;
        this.name = name;
        this.resdNum = resdNum;
        this.birthDt = birthDt;
        this.incomeKind = incomeKind;
        this.totalAmt = totalAmt;
        this.incomeTaxRate = incomeTaxRate;
        this.incomeTaxAmt = incomeTaxAmt;
        this.actualAmt = actualAmt;
        this.companyName = companyName;
        this.bizNum = bizNum;
        this.payDt = payDt;
        this.incomeContents = incomeContents;
        this.workStartDt = workStartDt;
        this.workEndDt = workEndDt;
        this.deliveryStandard = deliveryStandard;
        this.workQa = workQa;
        this.satisfaction = satisfaction;
        this.totalGrade = totalGrade;
    }
}
