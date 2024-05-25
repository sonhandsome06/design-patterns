package com.sonph.factory.accounts;

import java.math.BigDecimal;

public class BalanceAccount implements AccountFactory {

    private BigDecimal amount;

    @Override
    public String getAccountName() {
        return "BalanceAccount";
    }

    @Override
    public BigDecimal getAmount() {
        return BigDecimal.valueOf(10000000);
    }
}
