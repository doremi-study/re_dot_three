package co.kr.talentx.openscout.dto.user;

import co.kr.talentx.openscout.domain.user.User;
import co.kr.talentx.openscout.domain.user.UserKind;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CUserRequest {
	private String registerNumber;
	private String password;
	private UserKind userKind;

	@Builder
	public CUserRequest(String registerNumber, String password, UserKind userKind) {
		this.registerNumber = registerNumber;
		this.password = password;
		this.userKind = userKind;
	}

	public User toEntity(){
		return User.builder().registerNumber(registerNumber)
			.password(password)
			.userKind(UserKind.COMPANY_USER)
			.build();
	}
}
