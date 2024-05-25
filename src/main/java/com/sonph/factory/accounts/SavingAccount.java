package com.sonph.factory.accounts;

import java.math.BigDecimal;

public class SavingAccount implements AccountFactory {
    @Override
    public String getAccountName() {
        return "SavingAccount";
    }

    @Override
    public BigDecimal getAmount() {
        return BigDecimal.ONE;
    }
}
