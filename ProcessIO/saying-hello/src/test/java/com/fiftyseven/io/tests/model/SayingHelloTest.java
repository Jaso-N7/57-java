package com.fiftyseven.io.tests.model;

import com.fiftyseven.io.model.SayingHello;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class SayingHelloTest 
{
    private final Map<String, String> greetings = new HashMap();
    private final static String
        BRAIN_HELLO = "What's the plan for tonight, Brain?",
        CONNOR_HELLO = "Greetings Connor, of the clan MacLeod!",
        ROGER_HELLO = "Who framed you, Roger Rabbit?",
        DEFAULT_GREETING = "Hello, %s, nice to meet you!";
    
    public SayingHelloTest () {
        greetings.put("Brain", BRAIN_HELLO);
        greetings.put("Connor", CONNOR_HELLO);
        greetings.put("Roger", ROGER_HELLO);
        greetings.put("Anonymous", 
            String.format(DEFAULT_GREETING, "Anonymous"));
    }
    
    /**
     * 
     */
    @Test
    public void greeting_shouldContainName()
    {
        SayingHello expectedBrain = SayingHello.at("Brain"),
            expectedConnor = SayingHello.at("Connor"),
            expectedGuest = SayingHello.at(),
            expectedRandom = SayingHello.at("Anonymous");
        
        assertTrue( expectedBrain.greeting().contains("Brain") );
        assertTrue( expectedConnor.greeting().contains("Connor") );
        assertTrue( expectedGuest.greeting().contains("Guest") );
        assertTrue( expectedRandom.greeting().contains("Anonymous") );
    }
    
    @Test
    public void greeting_whenNameIsNotSupplied() {
        
        assertTrue( SayingHello.at().greeting()
                .equals( String.format(DEFAULT_GREETING, "Guest") ) 
        );
    }
    
    @Test
    public void greeting_shouldMatchExpectedGreeting () {
        
        for (var hello : greetings.entrySet()) {
            
            String hi = SayingHello.at( hello.getKey() )
                        .greeting();
            System.out.println( hello.getKey() + ": " + hi );
            
            System.out.println("Expects: \"" + hi + 
                    "\"\nActual: \"" + hello.getValue() + "\"");
            assertTrue( hi.equals(hello.getValue()) );
        }
        
    }
    
}
