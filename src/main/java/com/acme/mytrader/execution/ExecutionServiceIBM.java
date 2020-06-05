package com.acme.mytrader.execution;

public class ExecutionServiceIBM implements ExecutionService {
    @Override
    public void buy(String security, double price, int volume) {
        System.out.println(volume + " IBM units were bought");
    }

    @Override
    public void sell(String security, double price, int volume) {
        System.out.println(volume + " IBM units were sold");
    }
}
