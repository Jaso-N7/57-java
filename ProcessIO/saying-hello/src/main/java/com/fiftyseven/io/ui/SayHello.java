package com.fiftyseven.io.ui;

import com.fiftyseven.io.model.SayingHello;
import java.util.Scanner;

/**
 * Hello User!
 *
 */
public class SayHello 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        SayingHello hello;
        
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
