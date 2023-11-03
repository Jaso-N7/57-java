package com.fiftyseven.io.ui;

import com.fiftyseven.io.model.Counter;
import java.util.Scanner;

/**
 * Counts the number of characters in a given String
 *
 * @author Jason Robinson
 * @version 1.0-SNAPSHOT, 02/11/23
 */
public class Chars {

    /**
     * Demonstrates a possible use of counting characters from user input.
     *
     * @param args currently unused, outcome of using this is not guaranteed
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isUnanswered = false;
        do {
            System.out.print("What is the input string? ");
            String word = scan.nextLine();

            if (word.isEmpty()) {
                System.out.println("You must enter something.");
                
                isUnanswered = true;
            } else {
                Counter c = Counter.valueOf(word);

                System.out.println(c.getDetails());
                isUnanswered = false;
            }

        } while (isUnanswered);
    }
}
