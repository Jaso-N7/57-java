package com.fiftyseven.io.model;

import com.fiftyseven.io.model.Counter;

/**
 * Supports String related counting
 * 
 * @author Jason Robinson
 * @version 1.0-SNAPSHOT, 02/11/23
 */
public class Counter {
    
    private final String input;
    private int inputCount;
    
    private final static String RESPONSE = "%s has %d character(s).";
    
    private Counter(String word) {
        input = word;
    }
    
    /**
     * Static factory method that will always return an instance of {@code Counter}
     * <p>
     * Guarantees are not made that the instance will always be new.
     * 
     * @param word string that will be counted
     * @return {@code Counter} instance
     */
    public static Counter valueOf(String word) {
        return new Counter(word);
    }
    
    // REQUIRES: input to be non-null
    // MODIFIES: constant variable RESPONSE
    // EFFECTS: returns the outcome of counting the number characters
    public String getDetails () {
        return null;
    }
    
    // REQUIRES: input to be non-null
    // MODIFIES: inputCount will be updated
    // EFFECTS: returns the number of characters
    public int chars () {
        return 0;
    }
}
