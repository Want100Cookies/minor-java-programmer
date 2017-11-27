package com.Want100Cookies;

import com.Want100Cookies.model.impl.LoggerMessage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");

        LoggerMessage loggerMessage = (LoggerMessage) ctx.getBean("loggerMessage");

        String msg = loggerMessage.getMessage();

        System.out.println(msg);
    }
}
