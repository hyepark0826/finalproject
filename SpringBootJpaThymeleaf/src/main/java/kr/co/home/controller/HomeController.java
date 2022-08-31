package kr.co.home.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/home")
public class HomeController {
    
    //게시판 목록 페이지 이동
    @GetMapping("/home")
    public String home(Model m) throws Exception {
    	log.info("Controller @GetMapping(/home) 홈 화면이동 >>>>>>>>>>>>>>> ");
        return "home/home";
    }
}