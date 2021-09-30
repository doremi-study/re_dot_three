package co.kr.talentx.openscout.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByRegistNum(String registNum);

    public boolean existsByRegistNum(String registNum);
}
