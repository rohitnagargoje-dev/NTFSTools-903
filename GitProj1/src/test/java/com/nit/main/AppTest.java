package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest {

    
    @Test
    public void additionOfTwoNumbers() {
    	
    	App a1=new App();
    	
    	int excepted=30;
    	
    	int actual=a1.sum(10, 20);
    	
    	
    	
        assertEquals(excepted,actual);
    }
    
    @Test
    public void substractionOfTwoNumbers() {
    	
    	App a1=new App();
    	
    	int excepted=-30;
    	
    	int actual=a1.sum(-10, -20);
    	
    	
    	
        assertEquals(excepted,actual);
    }
    
    @Test
    public void testSumsWithZero() {
    	
    	App a1=new App();
    	
    	int excepted=0;
    	
    	int actual=a1.sum(0, 0);
    	
    	
    	
        assertEquals(excepted,actual);
    }
}
