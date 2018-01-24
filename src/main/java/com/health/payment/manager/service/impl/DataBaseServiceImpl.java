package com.health.payment.manager.service.impl;

import com.health.payment.manager.entity.TestUser;
import com.health.payment.manager.mapper.TestUserMapper;
import com.health.payment.manager.service.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Administrator
 * @date 2017/9/22
 */
@Service
public class DataBaseServiceImpl implements DataBaseService {

    @Autowired
    private TestUserMapper testUserMapper;

    @Override
    public TestUser query(int id) {
        System.out.println("查询信息------");
        return testUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public String testReturn(String ss) {
        return "testReturn";
    }
}
