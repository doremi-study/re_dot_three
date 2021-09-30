package co.kr.talentx.openscout.dto;

import co.kr.talentx.openscout.domain.user.User;
import co.kr.talentx.openscout.domain.user.UserKind;
import lombok.Builder;
import lombok.Getter;

@Getter
public class NjUserRequest {
    private String registNum;
    private String pwd;
    private UserKind userKind;

    @Builder
    public NjUserRequest(String registNum, String pwd, UserKind userKind) {
        this.registNum = registNum;
        this.pwd = pwd;
        this.userKind = userKind;
    }

    public User toEntity(){
        return User.builder().registNum(registNum)
                .pwd(pwd)
                .userKind(UserKind.NJOB_USER)
                .build();
    }
}
