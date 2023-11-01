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

    /**
     * Returns a greeting to the (un)specified user
     * 
     * @return a greeting
     */
    public String greeting() {
        // TODO: 2. Write a version of the program that displays different greetings
        //          for different people
        return String.format(HELLO, name);
    }

    @Override
    public String toString() {
        return "SayingHello to " + name + '}';
    }
        
}
