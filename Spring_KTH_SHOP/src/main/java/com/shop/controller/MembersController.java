package com.shop.controller;

import com.shop.domain.User_MembersVO;
import com.shop.service.testMembersService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j
@RequestMapping("/members/*")
@AllArgsConstructor
public class MembersController {

    private testMembersService service;

    //test User_Members 테이블 조회
    @GetMapping("/list")
    public void list(Model model) {
        log.info(model);
        model.addAttribute("list", service.getList());
    }

    //User_Members 테이블 - 사용자 회원가입
    /*@PostMapping("/register")
    public String register(User_MembersVO user_membersVO, RedirectAttributes attributes) {
        log.info("register: " + user_membersVO);

        service.
    }*/

}
