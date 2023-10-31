package com.fiftyseven.intro;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class TipCalculator 
{
    private final BigDecimal billAmount;
    private final double tipRate;
    
    
    private TipCalculator (BigDecimal billAmount, double tipRate) {
        this.billAmount = billAmount;
        this.tipRate = tipRate;
    }
    
    public static TipCalculator instance(BigDecimal billAmount, double tipRate) {
        return new TipCalculator(billAmount, tipRate);
    }
    
    // REQUIRES: billAmount >= 0.00 & tipRate >= 0.00
    // MODIFIES: updates the tip amount
    // EFFECTS: calculates and returns the Tip
    public BigDecimal tip () {
        
        return BigDecimal.ZERO;
    }
    
    // REQUIRES: billAmount >= 0.00 & tipRate >= 0.00
    // MODIFIES: updates the total
    // EFFECTS: calculates and returns the total
    public BigDecimal total () {
        return BigDecimal.ZERO;
    }

    @Override
    public String toString() {
        return "TipCalculator{" + "Bill Amount=" + billAmount + ", Tip Rate=" + tipRate + 
                "Tip=$"+ tip() +", Total=$" + total() + '}';
    }
    
    
}
