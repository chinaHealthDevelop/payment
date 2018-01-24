package com.health.payment.manager.service;

import com.health.payment.manager.entity.TestUser;

/**
 * @auther Administrator
 * @date 2017/9/22
 */
public interface DataBaseService {
    TestUser query(int id);
    String testReturn(String ss);
}
