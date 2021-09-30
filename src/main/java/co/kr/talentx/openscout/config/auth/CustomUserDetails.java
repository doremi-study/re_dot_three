package co.kr.talentx.openscout.config.auth;

import co.kr.talentx.openscout.domain.user.User;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CustomUserDetails {
    private String username;
    private String password;

    @Builder
    public CustomUserDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User toEntity(){
        return User.builder().registNum(username)
                .pwd(password)
                .build();
    }
}
