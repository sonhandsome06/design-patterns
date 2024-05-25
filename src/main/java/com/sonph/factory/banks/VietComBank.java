package com.sonph.factory.banks;

public class VietComBank implements BankFactory {
    @Override
    public String getBankName() {
        return "VietcomBank";
    }
}
