package com.dzc.wrapper;

import com.dzc.learn.wrapper.rpc.MenuService;
import com.dzc.learn.wrapper.rpc.ProxyFactory;
import org.junit.Test;

public class TestWrapper {

    @Test
    public void testWrapper() {
        ProxyFactory proxy = new ProxyFactory(com.dzc.learn.wrapper.rpc.MenuService.class);
        MenuService menuService = proxy.getInstance();
        menuService.sayHello();
    }
}
