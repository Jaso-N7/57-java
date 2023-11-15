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
    
    /**
     * Given that {@code .valueOf(String s)} is non-null,
     * returns the outcome of counting the number characters.
     * 
     * @return the details of counting the number characters
     */
    public String getDetails () {
        return String.format(RESPONSE,
                input, chars());
    }
    
    /**
     * As long as the {@code .valueOf(String s)} is non-null, 
     * returns the number of characters.
     * @return the number of characters in the given string
     */
    public int chars () {
        return input.length();
    }
}
