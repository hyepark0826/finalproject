package kr.co.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.login.domain.TestUser;

public interface LoginRepository extends JpaRepository<TestUser, Long> {

	Optional<TestUser> findByUserIdAndUserPw(String userId, String userPw);
	
}
