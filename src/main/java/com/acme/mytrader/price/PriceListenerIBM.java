package com.acme.mytrader.price;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.execution.ExecutionServiceIBM;

public class PriceListenerIBM implements PriceListener {
    private String key;
    private PriceSource priceSource;
    private ExecutionService executionService;
    private double minPrice = 55.0;
    private int lotsToBuy = 100;
    private String symbol = "IBM";

    public PriceListenerIBM() {
        this.priceSource = new PriceSourceStockMarket();
        this.executionService = new ExecutionServiceIBM();
    }

    /**
     * For a given price if price is below 55.0 then 100 units of IBM shares will be bought
     * For price equal or above 55.0 no shares are bought
     * @param security
     * @param price
     * @return number of IBM units bought
     */
    @Override
    public int priceUpdate(String security, double price) {
        int bought = 0;
        if (price < 0) {
            System.out.println("Invalid price!");
            return 0;
        }
        connect();
        if (price < minPrice) {
            executionService.buy(security, price, lotsToBuy);
            bought = lotsToBuy;
        }
        disconnect();
        return bought;
    }

    private double getPrice(String symbol) {
        double randomDouble = Math.random() * (110 - 50 + 1) + 50;
        return randomDouble;
    }

    /**
     * Connect to price source
     */
    private void connect() {
        priceSource.addPriceListener(this);
    }

    /**
     * Disconnect from price source
     */
    private void disconnect() {
        priceSource.removePriceListener(this);
    }
}
