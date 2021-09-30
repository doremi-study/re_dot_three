package co.kr.talentx.openscout.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserKind userKind;

    @Column
    private String registNum;

    @Column
    private String pwd;

    @Builder
    public User(Long id, UserKind userKind, String registNum, String pwd) {
        this.id = id;
        this.userKind = userKind;
        this.registNum = registNum;
        this.pwd = pwd;
    }
}
