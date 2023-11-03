package com.fiftyseven.tests.io.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.fiftyseven.io.model.Counter;

/**
 *
 * @author Jason Robinson
 */
public class CounterTest {
    
    private Counter c;
    private final static String 
            INPUT = "Homer",
            RESPONSE = "%s has %d character(s).";
    
    
    public CounterTest() {
    }
    
    @BeforeEach
    public void setUp() {
        c = Counter.valueOf(INPUT);
    }

    
    @Test
    public void responseContainsOriginalStringAtStart() {
        
        String res = c.getDetails();
        
        assertEquals(0, res.indexOf(INPUT));
    }
    
    @Test
    public void responseContainsOriginalString() {
        
        String res = c.getDetails();
        
        assertTrue(res.contains(INPUT));
    }
    
    @Test
    public void responseCountedCharacter () {
        
        int expected = INPUT.length();
        int actual = c.chars();
        
        assertEquals(expected, actual);
    }
}
