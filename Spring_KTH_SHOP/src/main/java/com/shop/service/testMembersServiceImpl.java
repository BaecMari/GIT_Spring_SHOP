package com.shop.service;

import com.shop.domain.User_MembersVO;
import com.shop.mapper.testMembersMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
@AllArgsConstructor
public class testMembersServiceImpl implements testMembersService{
    //인터페이스 testMembersService 를 구현한다.

    //spring 4.3 이상에서 자동 처리
    //lombok 을 이용한 setter 로 처리
    @Setter(onMethod_ = @Autowired)
    private testMembersMapper mapper;

    @Override
    public List<User_MembersVO> getList() {
        log.info("getList()..........");
        return mapper.getList();
    }

    @Override
    public void register(User_MembersVO user_membersVO) {
        log.info("register............" + user_membersVO);

        mapper.insert(user_membersVO);
    }
}
