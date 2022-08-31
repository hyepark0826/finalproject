package kr.co.login.service;

import java.util.Optional;

import kr.co.login.domain.TestUser;

public interface LoginService {
	/*관리자 정보 조회*/
	public Optional<TestUser> selectLogin(TestUser testUser);
	
}
