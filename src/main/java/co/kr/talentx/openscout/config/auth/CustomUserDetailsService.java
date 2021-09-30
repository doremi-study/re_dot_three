package co.kr.talentx.openscout.config.auth;

import co.kr.talentx.openscout.domain.user.User;
import co.kr.talentx.openscout.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByRegistNum(username)
                                  .orElseThrow(() -> new UsernameNotFoundException("가입하지 않은 아이디거나, 잘못된 비밀번호입니다."));

        return (UserDetails) CustomUserDetails.builder().username(username).password(user.getPwd()).build();
    }
}
