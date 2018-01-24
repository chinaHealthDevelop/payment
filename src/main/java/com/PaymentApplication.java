package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auther Administrator
 * @date 2017/9/21
 */

/**
 * hetaoworld
 */
@SpringBootApplication
@MapperScan("com.health.payment.manager.mapper")
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class,args);
    }
}
