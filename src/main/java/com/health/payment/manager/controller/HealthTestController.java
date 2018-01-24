package com.health.payment.manager.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.health.payment.manager.entity.TestUser;
import com.health.payment.manager.service.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthTestController {

    @Autowired
    private DataBaseService dataBaseService;

    @RequestMapping("/selectMsg")
    public String selectMsg(int id) {
        TestUser query = dataBaseService.query(id);
        if (query != null) {
            return query.getName();
        }

        //测试分组权限
        return "id 有";
    }
}
