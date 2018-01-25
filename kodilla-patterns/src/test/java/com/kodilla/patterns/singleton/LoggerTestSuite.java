package com.kodilla.patterns.singleton;

import org.junit.*;

public class LoggerTestSuite {

    @Before
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
