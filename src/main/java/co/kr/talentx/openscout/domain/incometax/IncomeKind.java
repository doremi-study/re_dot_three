package co.kr.talentx.openscout.domain.incometax;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum IncomeKind {
    @JsonProperty("근로소득")
    EARNED_INCOME("근로소득"),
    @JsonProperty("사업소득")
    BUSINESS_INCOME("사업소득"),
    @JsonProperty("기타소득")
    OTHER_INCOME("기타소득");

    private final String codeValue;

}
