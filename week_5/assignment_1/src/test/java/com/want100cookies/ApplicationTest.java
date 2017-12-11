package com.want100cookies;

import org.junit.Assert;
import org.junit.Test;


public class ApplicationTest {

    @Test
    public void HelloWorldTestCase() {
        Assert.assertEquals(Application.hello("world"), "Hello, world!");
    }
}
