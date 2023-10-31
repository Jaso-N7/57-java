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
    private TipCalculator tc;
    private final static BigDecimal BILL_AMOUNT = BigDecimal.valueOf(10L);
    private final static double TIP_RATE = 15.00D;
    
    @BeforeEach
    public void setup () {
        tc = TipCalculator.instance(BILL_AMOUNT, TIP_RATE);
    }
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void tip_MustBeGreaterThanZero()
    {
        assertTrue(tc.tip().signum() > 0);
    }
    
    @Test
    public void tip_CalculatedAtFifteenPercent() {
        
        var tipAt15 = new BigDecimal("1.50");
        
        assertTrue(tc.tip().equals(tipAt15));
    }
    
    @Test
    public void total_MustBeGreaterThanZero() {
        assertTrue(tc.total().signum() > 0);
    }
    
    @Test
    public void total_WithFifteenPercentTipRate () {
        
        var totalWith15 = new BigDecimal("11.50");
        
        assertTrue(tc.total().equals(totalWith15));
    }
    
    
}
