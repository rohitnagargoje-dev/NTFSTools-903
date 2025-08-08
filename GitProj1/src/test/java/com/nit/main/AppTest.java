package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
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
}
