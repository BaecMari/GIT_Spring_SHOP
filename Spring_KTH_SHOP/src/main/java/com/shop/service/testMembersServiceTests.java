package com.shop.service;

import com.shop.domain.User_MembersVO;
import com.shop.mapper.testMembersMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
//java Config
@ContextConfiguration(classes = {com.shop.config.RootConfig.class})
@Log4j
public class testMembersServiceTests {

    @Setter(onMethod_ = {@Autowired})
    private testMembersService service;
    //private testMembersMapper service;

    //서비스 연결 테스트
    @Test
    public void testExist() {
        log.info(service);
        assertNotNull(service);
    }

    //사용자 목록 조회
    @Test
    public void testGetList() {
        service.getList().forEach(members -> log.info(members));
    }

    //사용자 회원가입 테스트
    @Test
    public void testRegister() {

        //VO 클래스
        User_MembersVO user_membersVO = new User_MembersVO();
        user_membersVO.setUserid("d");
        user_membersVO.setPasswd("d");
        user_membersVO.setName("이");
        user_membersVO.setBirthdate(19980208);
        user_membersVO.setCellphone("01045453232");
        user_membersVO.setGender(1); // 0 : 남자, 1 : 여자
        user_membersVO.setAddress("인천");

        //인터페이스 내 메서드 호출
        service.register(user_membersVO);

        log.info("생성된 유저 이름 : " + user_membersVO.getName());
    }
}
