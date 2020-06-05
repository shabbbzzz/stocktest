package com.acme.mytrader.strategy;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceListenerIBM;
import com.acme.mytrader.price.PriceSource;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {

    /**
     * Buying IBM shares through IBM price listener
     * @param price
     * @return number of IBM units bought
     */
    public int buyIBMStocks(double price){
        PriceListener priceListener = new PriceListenerIBM();
        return priceListener.priceUpdate("", price);
    }


}
