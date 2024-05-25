package com.sonph.factory.accounts;

import java.math.BigDecimal;

public class CurrentAccount implements AccountFactory {
    @Override
    public String getAccountName() {
        return "CurrentAccount";
    }

    @Override
    public BigDecimal getAmount() {
        return BigDecimal.ONE;
    }
}
