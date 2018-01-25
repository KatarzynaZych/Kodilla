package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void logTest(){
        // given and when
        Logger.getInstance().log("Hello, hello !");
        // then
    }
    @Test
    public void getLastLogTest(){
        // given
        String result = Logger.getInstance().getLastLog();
        //when and then
        Assert.assertEquals("Hello, hello !", result);
    }
}
