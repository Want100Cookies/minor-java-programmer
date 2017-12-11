package com.want100cookies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;


public class ApplicationTest {

    @Test
    public void testWorld() {
        Assert.assertEquals(Application.hello("world"), "Hello, world!");
    }

    @Test
    public void testIfNameIsProperlyFormatted() {
        String expected = "Jensen";
        String actual = Application.properNameFormat("jenSen");

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfFormatThrowsException() {
        Application.properNameFormat(null);
        fail("properNameFormat should throw an exception");
    }
}
