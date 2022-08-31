package kr.co.login.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.login.domain.TestUser;
import kr.co.login.repository.LoginRepository;
import kr.co.login.service.LoginService;

/*implements는 인터페이스를 상속받아서 구현하는 클래스*/

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	/* 관리자 로그인 조회*/
	public Optional<TestUser> selectLogin(TestUser testUser) {
		return loginRepository.findByUserIdAndUserPw(testUser.getUserId(), testUser.getUserPw());
	}
	
}
