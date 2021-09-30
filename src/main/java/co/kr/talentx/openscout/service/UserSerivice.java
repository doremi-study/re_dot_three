package co.kr.talentx.openscout.service;

import co.kr.talentx.openscout.domain.user.User;
import co.kr.talentx.openscout.domain.user.UserRepository;
import co.kr.talentx.openscout.dto.CUserRequest;
import co.kr.talentx.openscout.dto.NjUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserSerivice {

    private final UserRepository userRepository;

    public void saveCUser(CUserRequest cUserRequest) throws Exception {
        User user = cUserRequest.toEntity();
        saveUser(user);

    }

    public void saveNjUser(NjUserRequest njUserRequest) throws Exception {
        User user = njUserRequest.toEntity();
        saveUser(user);
    }

    private void saveUser(User user) throws Exception {
        checkDupRegistNum(user);
        userRepository.save(user);
    }

    private void checkDupRegistNum(User user) throws Exception {
        String registNum = user.getRegistNum();
        if (userRepository.existsByRegistNum(registNum)) {
            throw new Exception("이미 등록된 회원번호가 있습니다.");
        }
    }




}
