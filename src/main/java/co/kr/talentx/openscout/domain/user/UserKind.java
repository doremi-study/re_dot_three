package co.kr.talentx.openscout.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum UserKind {
    COMPANY_USER("ROLE_COMPANY", "기업사용자"),
    NJOB_USER("ROLE_NJOB", "N잡러유");

    private final String key;
    private final String title;
}
