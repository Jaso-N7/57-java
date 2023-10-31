package com.fiftyseven.io.tests.model;

import com.fiftyseven.io.model.SayingHello;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class SayingHelloTest 
{
    private SayingHello sayName, sayFullName, sayHello;
    private final static String 
            NAME = "Brian",
            FULL_NAME = "Connor McCleod",
            DEFAULT_GREETING = "Hello, Guest, nice to meet you!";
    
    
    @BeforeEach
    public void setup () {
        sayName = SayingHello.at(NAME);
        sayFullName = SayingHello.at(FULL_NAME);
        sayHello = SayingHello.at();
    }
    /**
     * 
     */
    @Test
    public void greeting_shouldContainName()
    {
        assertTrue( sayName.greeting().contains(NAME) );
        assertTrue( sayFullName.greeting().contains(FULL_NAME) );
    }
    
    @Test
    public void greeting_whenNameIsNotSupplied() {
        
        assertEquals( DEFAULT_GREETING, sayHello.greeting() );
    }
    
    @Test
    public void greeting_shouldMatchExpectedGreeting () {
        
        String expectedNameGreeting = expectedGreeting( NAME ),
                expectedFullNameGreeting = expectedGreeting( FULL_NAME );
        
        assertTrue( sayName.greeting()
                .equals(expectedNameGreeting)
        );
        assertTrue( sayFullName.greeting()
                .equals(expectedFullNameGreeting)
        );
    }
    
    private String expectedGreeting(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }
}
