package com.fiftyseven.intro;

import java.util.Scanner;
import java.math.BigDecimal;

/**
 * Examples of how to interact with {@code TipCalculator}
 * 
 * @author Jason Robinson
 * @version 1.0-SNAPSHOT, 30/10/23
 */
public class Main {
   
    /**
     * Demonstrates the uses of {@code TipCalculator} to calculate simple tips
     * 
     * @param args optional parameters, currently unused
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        // TODO: Instead of displaying an error message and exiting the program
        //       keep asking the user for correct input until it is provided
        // TODO: Don't allow the user to enter a negative number.
        // TODO: Implement this program as a GUI that automatically updates the
        //       values when any value changes
        System.out.print("What is the bill amount? ");
        BigDecimal billAmount = s.nextBigDecimal();
        
        // TODO: Instead of the user entering the value of the tip as a percentage,
        //       have the user drag a slider that rates satisfaction with the server,
        //       using a range between 5% and 20%
        System.out.print("\nWhat is the tip rate? ");
        double tipRate = s.nextDouble();
        
        TipCalculator tc = TipCalculator.instance(billAmount, tipRate);
        
        System.out.println('\n' + "=".repeat(20) + '\n');
        System.out.println("Tip: $" + tc.tip());
        System.out.println("Total: $" + tc.total());
        
        System.out.println("\n" + tc);
    }
}
