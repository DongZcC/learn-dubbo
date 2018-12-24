package com.dzc.learn.wrapper.config;

import com.dzc.learn.wrapper.rpc.ProxyFactory;

public class RefrenceConfig<T> {
    private Class<?> interfaceClass;

    private transient volatile T ref;

    public synchronized T get() {
        if (ref == null) {
            init();
        }
        return ref;
    }

    private void init() {
        ref = new ProxyFactory(interfaceClass).getInstance();
    }

    public Class<?> getInterfaceClass() {
        return interfaceClass;
    }

    public void setInterfaceClass(Class<?> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }
}
