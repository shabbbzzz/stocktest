package com.acme.mytrader.price;

public class PriceSourceStockMarket implements PriceSource {
    @Override
    public void addPriceListener(PriceListener listener) {
        System.out.println("Started monitoring IBM price on the stock market... ");
    }

    @Override
    public void removePriceListener(PriceListener listener) {
        System.out.println("Stopped monitoring IBM price on the stock market... ");
    }
}
