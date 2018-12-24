package com.dzc.learn.wrapper.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class RPCBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return ReferenceBean.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String interfaceClass = element.getAttribute("interface");
        if (StringUtils.hasText(interfaceClass)) {
            builder.addPropertyValue("interfaceClass", interfaceClass);
        }
    }
}
