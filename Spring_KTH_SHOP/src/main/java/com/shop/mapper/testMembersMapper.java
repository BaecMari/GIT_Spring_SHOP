package com.shop.mapper;

import com.shop.domain.User_MembersVO;

import java.util.List;

public interface testMembersMapper {

    //사용자 목록 조회
    //@Select("select * from User_Members")
    public List<User_MembersVO> getList();

    //사용자 회원가입
    public void insert(User_MembersVO user_membersVO);
    //public void insertSelectKey(User_MembersVO user_membersVO);
}
