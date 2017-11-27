package com.Want100Cookies;

import com.Want100Cookies.model.Processor;
import com.Want100Cookies.model.impl.LoggerMessage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Processor processor = (Processor) ctx.getBean("processor");

        String msg = processor.process();

        System.out.println(msg);
    }
}
