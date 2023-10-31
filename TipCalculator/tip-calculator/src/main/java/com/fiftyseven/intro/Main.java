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
        
        System.out.print("What is the bill amount? ");
        BigDecimal billAmount = s.nextBigDecimal();
        
        System.out.print("\nWhat is the tip rate? ");
        double tipRate = s.nextDouble();
        
        TipCalculator tc = TipCalculator.instance(billAmount, tipRate);
        
        System.out.println('\n' + "=".repeat(20) + '\n');
        System.out.println("Tip: $" + tc.tip());
        System.out.println("Total: $" + tc.total());
        
        System.out.println("\n" + tc);
    }
}
