package com.shop.service;

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

    @Test
    public void testGetList() {
        service.getList().forEach(members -> log.info(members));
    }
}
