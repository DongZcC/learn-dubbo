package com.dzc.wrapper;

import com.dzc.learn.wrapper.rpc.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:consumer.xml")
public class TestRpc {

    @Autowired
    private MenuService menuService;

    @Test
    public void test() {
        menuService.sayHello();
    }
}
