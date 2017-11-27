package com.Want100Cookies.model;

import com.Want100Cookies.model.impl.LoggerMessage;

public class Processor {

    private LoggerMessage message;

    public void setMessage(LoggerMessage message) {
        this.message = message;
    }

    public String process() {
        return this.message.getMessage();
    }
}
