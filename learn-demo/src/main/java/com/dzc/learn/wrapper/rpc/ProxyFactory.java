package com.dzc.learn.wrapper.rpc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements InvocationHandler {

    private Class interfaces;

    public ProxyFactory(Class interfaces) {
        this.interfaces = interfaces;
    }

    public <T> T getInstance() {
        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] {interfaces}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method);
        System.out.println("编码");
        System.out.println("发送网络请求");
        System.out.println("结果并返回");
        return null;
    }
}
