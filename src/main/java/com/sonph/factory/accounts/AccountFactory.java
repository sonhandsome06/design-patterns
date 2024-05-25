package com.sonph.factory.accounts;

import java.math.BigDecimal;

public interface AccountFactory {
    public String getAccountName();
    public BigDecimal getAmount();

}
