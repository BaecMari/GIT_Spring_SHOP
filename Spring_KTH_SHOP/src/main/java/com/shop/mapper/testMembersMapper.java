package com.shop.mapper;

import com.shop.domain.SampleMembersVO;

import java.util.List;

public interface testMembersMapper {

    //@Select("select * from User_Members")
    public List<SampleMembersVO> getList();
}
