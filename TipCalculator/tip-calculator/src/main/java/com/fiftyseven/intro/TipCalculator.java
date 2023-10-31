package com.fiftyseven.intro;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Hello world!
 *
 */
public class TipCalculator 
{
    private final BigDecimal billAmount;
    private final double tipRate;
    
    private final static BigDecimal PERC = new BigDecimal("100.00");
    
    
    private TipCalculator (BigDecimal billAmount, double tipRate) {
        this.billAmount = billAmount;
        this.tipRate = tipRate;
    }
    
    public static TipCalculator instance(BigDecimal billAmount, double tipRate) {
        return new TipCalculator(billAmount, tipRate);
    }
    
    // REQUIRES: billAmount >= 0.00 & tipRate >= 0.00
    // MODIFIES: updates the tip amount
    // EFFECTS: returns the tip
    public BigDecimal tip () {
        var rate = BigDecimal.valueOf(tipRate);
        MathContext mc = new MathContext(3);
        
        return billAmount.multiply(rate.divide(PERC)).round(mc);
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
                " Tip=$"+ tip() +", Total=$" + total() + '}';
    }
    
    
}
