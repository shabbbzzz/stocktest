package com.acme.mytrader.strategy;

import org.junit.Test;
import org.junit.Assert;

public class TradingStrategyTest {
    TradingStrategy tradingStrategy = new TradingStrategy();

    @Test
    public void testInvalidPrice() {
        int i = tradingStrategy.buyIBMStocks(-1);
        System.out.println("Bought " + i);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testLowPrice() {
        int i = tradingStrategy.buyIBMStocks(40);
        System.out.println("Bought " + i);
        Assert.assertEquals(100, i);
    }

    @Test
    public void testBoundaryPrice1() {
        int i = tradingStrategy.buyIBMStocks(54.99);
        System.out.println("Bought " + i);
        Assert.assertEquals(100, i);
    }

    @Test
    public void testBoundaryPrice2() {
        int i = tradingStrategy.buyIBMStocks(55);
        System.out.println("Bought " + i);
        Assert.assertEquals(0, i);
    }

    @Test
    public void testHighPrice() {
        int i = tradingStrategy.buyIBMStocks(70);
        System.out.println("Bought " + i);
        Assert.assertEquals(0, i);
    }

}
