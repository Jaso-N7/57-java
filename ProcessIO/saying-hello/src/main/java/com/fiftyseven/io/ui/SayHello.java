package com.fiftyseven.io.ui;

import com.fiftyseven.io.model.SayingHello;
import java.util.Scanner;

/**
 * Prompts for your name and prints a greeting using your name
 * 
 * @author Jason Robinson
 * @version 1.1, 31/10/23
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
        
        System.out.print( "What is your name? " );
        
        System.out.println( SayingHello.at( s.nextLine() ).greeting() );
    }
}
