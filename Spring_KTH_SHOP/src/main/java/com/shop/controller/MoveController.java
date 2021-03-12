package com.shop.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//페이지 이동 컨트롤러
@Controller
@Log4j
@RequestMapping("/Move/*")
@AllArgsConstructor
public class MoveController {

    //로그인 페이지 이동
    @GetMapping("/Login") //Login 이라 Url 에 입력 - > Login_Register/Login.jsp 로 이동
    public String Login() {
        return "/Login_Register/Login";
    }

    //메인 페이지 이동
    @GetMapping("/Main")
    public String Main() {
        return "/Main/Main";
    }
}
