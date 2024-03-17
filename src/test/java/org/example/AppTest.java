package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest {
    @Test
    @DisplayName("Test that program print Hello World")
    public void testThatProgramPrintHelloWorld(){
       Assertions.assertEquals(App.helloworld(),"Hello World!");
    }
}

