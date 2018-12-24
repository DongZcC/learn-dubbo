package com.dzc.spi;

import com.dzc.learn.spi.SayName;
import org.junit.Test;

import java.util.ServiceLoader;

public class TesetSpi {

    @Test
    public void test() {
        ServiceLoader<SayName> loaders = ServiceLoader.load(SayName.class);
        for (SayName sayName : loaders) {
            sayName.say();
        }
    }
}
