package com.want100cookies;

import org.junit.Assert;
import org.junit.Test;


public class ApplicationTest {

    @Test
    public void testApplication() {
        Assert.assertEquals(Application.hello("world"), "Hello, world!");
    }
}
