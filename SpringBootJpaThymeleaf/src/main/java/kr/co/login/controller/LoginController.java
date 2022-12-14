package kr.co.login.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import kr.co.login.domain.TestUser;
import kr.co.login.service.LoginService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
    
    //게시판 목록 페이지 이동
    @GetMapping("/login")
    public String login(Model m) throws Exception {
    	log.info("Controller @GetMapping(/home) 홈 화면이동 >>>>>>>>>>>>>>> ");
        return "login/login";
    }

    //게시판 목록 페이지 이동
    @GetMapping("/selectLogin")
    public void selectLogin(Model m) throws Exception {
    	
    	TestUser testUser = new TestUser();
    	
    	testUser.setUserId("mk");
    	testUser.setUserPw("1234");
    	
    	Optional<TestUser> testUser2= loginService.selectLogin(testUser);
    
    	log.info("회원정보결과 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>: "+testUser2.toString());
    	
    }
}