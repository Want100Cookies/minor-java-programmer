package com.Want100Cookies;

import com.Want100Cookies.model.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    @Autowired
    Processor processor;

    public static void main(String... args) {
        new Main();
    }

    public Main() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
        AutowireCapableBeanFactory factory = ctx.getAutowireCapableBeanFactory();
        factory.autowireBean(this);


        String msg = processor.process();

        System.out.println(msg);
    }
}
