package com.fiftyseven.io.model;

/**
 *
 * @author jason
 */
public class SayingHello {
    
    private final String name;
    private final static String HELLO = "Hello, %s, nice to meet you!",
        BRAIN_HELLO = "What's the plan for tonight, Brain?",
        CONNOR_HELLO = "Greetings Connor, of the clan MacLeod!",
        ROGER_HELLO = "Who framed you, Roger Rabbit?";

    private SayingHello(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @param name
     * @return 
     */
    public static SayingHello at(String name) {
        return new SayingHello(name);
    }
    
    public static SayingHello at() {
        return new SayingHello("Guest");
    }

    /**
     * Returns a greeting to the (un)specified user
     * 
     * @return a greeting
     */
    public String greeting() {
        
        return switch (name) { 
            case "Brain" -> BRAIN_HELLO;
            case "Connor" -> CONNOR_HELLO;
            case "Roger" -> ROGER_HELLO;
            default -> String.format(HELLO, name);
        };
    }

    @Override
    public String toString() {
        return "SayingHello to " + name + '}';
    }
        
}
