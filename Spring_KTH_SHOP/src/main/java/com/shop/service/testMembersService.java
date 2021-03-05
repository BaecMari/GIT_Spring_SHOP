package com.shop.service;

import com.shop.domain.User_MembersVO;

import java.util.List;

public interface testMembersService {

    //사용자 멤버 조회
    public List<User_MembersVO> getList();

    //사용자 회원가입
    public void register(User_MembersVO user_membersVO);
}
