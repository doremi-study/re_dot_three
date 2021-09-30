package co.kr.talentx.openscout.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ResultMessage {
    private String message;
    private int code;

    @Builder
    public ResultMessage(String message, int code) {
        this.message = message;
        this.code = code;
    }
}
