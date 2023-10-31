package com.fiftyseven.intro;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for the Tip Calculator.
 */
public class TipCalculatorTest 
{
    private TipCalculator tc_10, tc_11_25;
    private final static BigDecimal BILL_AMOUNT_10 = new BigDecimal("10");
    private final static BigDecimal BILL_AMOUNT_11_25 = new BigDecimal("11.25");
    private final static double TIP_RATE_15 = 15.00D;
    
    @BeforeEach
    public void setup () {
        tc_10 = TipCalculator.instance(BILL_AMOUNT_10, TIP_RATE_15);
        tc_11_25 = TipCalculator.instance(BILL_AMOUNT_11_25, TIP_RATE_15);
    }
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void tip_MustBeGreaterThanZero()
    {
        assertTrue(tc_10.tip().signum() > 0);
        assertTrue(tc_11_25.tip().signum() > 0);
    }
    
    @Test
    public void tip_CalculatedAtFifteenPercent() {
        
        var expectedTip10 = new BigDecimal("1.50");
        var expectedTip1125 = new BigDecimal("1.69");
        
        System.out.println(tc_10);
        System.out.println(tc_11_25);
        
        assertTrue(tc_10.tip().equals(expectedTip10));
        assertTrue(tc_11_25.tip().equals(expectedTip1125));
    }
    
    @Test
    public void total_MustBeGreaterThanZero() {
        assertTrue(tc_10.total().signum() > 0);
        assertTrue(tc_11_25.total().signum() > 0);
    }
    
    @Test
    public void total_WithFifteenPercentTipRate () {
        
        var expectedTotal10 = new BigDecimal("11.50");
        var expectedTotal1125= new BigDecimal("12.94");
        
        assertTrue(tc_10.total().equals(expectedTotal10));
        assertTrue(tc_11_25.total().equals(expectedTotal1125));
    }
    
//    private BigDecimal tipOracle (BigDecimal bill, double rate) {
//        var percent = BigDecimal.valueOf(100.00D);
//        return bill.multiply(BigDecimal.valueOf(rate).divide(percent));
//    }
}
