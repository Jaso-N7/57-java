package com.fiftyseven.io.model;

/**
 *
 * @author jason
 */
public class SayingHello {
    
    private final String name;
    private final static String HELLO = "Hello, %s, nice to meet you!";

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
    
    // REQUIRES: name to be set
    // EFFECTS: return a greeting to name
    public String greeting() {
        return String.format(HELLO, name);
    }

    @Override
    public String toString() {
        return "SayingHello to " + name + '}';
    }
        
}
