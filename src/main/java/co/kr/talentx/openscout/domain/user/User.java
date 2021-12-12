package co.kr.talentx.openscout.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Enumerated(EnumType.STRING)
	private UserKind userKind;

	@Column
	private String registerNumber;

	@Column
	private String password;

	@Builder
	public User(Long id, UserKind userKind, String registerNumber, String password) {
		this.id = id;
		this.userKind = userKind;
		this.registerNumber = registerNumber;
		this.password = password;
	}

}
