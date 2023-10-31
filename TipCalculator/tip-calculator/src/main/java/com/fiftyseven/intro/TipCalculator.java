package com.fiftyseven.intro;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Implements a simple tip calculator
 *
 * <p>USAGE: 
 * {@code 
 *   TipCalculator tc = TipCalculator.instance(billAmount, tipRate); 
 * }
 */
public final class TipCalculator 
{
    private final BigDecimal billAmount;
    private final double tipRate;
    
    private final static BigDecimal PERC = new BigDecimal("100.00");
    private final static MathContext mc = new MathContext(3);
    
    
    private TipCalculator (BigDecimal billAmount, double tipRate) {
        this.billAmount = billAmount;
        this.tipRate = tipRate;
    }
    
    /**
     * Returns a new {@code TipCalculator} instance.
     * 
     * @param billAmount
     * @param tipRate
     * @return a new {@code TipCalculator} instance
     */
    public static TipCalculator instance(BigDecimal billAmount, double tipRate) {
        return new TipCalculator(billAmount, tipRate);
    }
    
    /**
     * Gets the tip that will be applied to the total due.
     * <p>
     * This method requires the bill amount and the tip rate to be greater than
     * or equal to zero.
     * 
     * @return the tip as a dollar amount
     */
    public BigDecimal tip () {
        var rate = BigDecimal.valueOf(tipRate);
                
        return billAmount.multiply(rate.divide(PERC)).round(mc);
    }
    
    /**
     * Gets the total due on the bill, including any applied tips.
     * <p>
     * For this to work correctly, the bill amount and tip rate are required to
     * be greater than or equal to zero.
     * 
     * @return the total
     */
    public BigDecimal total () {
        return billAmount.add(tip());
    }

    @Override
    public String toString() {
        return "TipCalculator{" + "Bill Amount=" + billAmount + ", Tip Rate=" + tipRate + 
                " Tip=$"+ tip() +", Total=$" + total() + '}';
    }
    
    
}
