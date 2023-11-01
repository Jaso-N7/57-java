package com.fiftyseven.io.ui;

import com.fiftyseven.io.model.SayingHello;
import java.util.Scanner;

/**
 * Prompts for your name and prints a greeting using your name
 * 
 * @author Jason Robinson
 * @version 1.0, 31/10/23
 */
public class SayHello 
{
    /**
     * 
     * @param args unused
     */
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        SayingHello hello;
        
        // TODO: 1. Write a new version of the program without using any variables.
        System.out.print( "What is your name? " );
        String user = s.nextLine();
        
        if (user.isEmpty()) {
            hello = SayingHello.at();
        } else {
            hello = SayingHello.at( user );
        }
        
        System.out.println( hello.greeting() );
    }
}
