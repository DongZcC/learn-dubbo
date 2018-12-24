package com.dzc.learn.wrapper.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class RPCNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("reference", new RPCBeanDefinitionParser());
    }
}
