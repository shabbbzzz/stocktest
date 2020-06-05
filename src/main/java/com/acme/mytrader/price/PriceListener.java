package com.acme.mytrader.price;

public interface PriceListener {
    int priceUpdate(String security, double price);
}