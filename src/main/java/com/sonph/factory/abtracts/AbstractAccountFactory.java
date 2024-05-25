package com.sonph.factory.abtracts;

import com.sonph.factory.accounts.AccountFactory;
import com.sonph.factory.accounts.BalanceAccount;
import com.sonph.factory.accounts.CurrentAccount;
import com.sonph.factory.accounts.SavingAccount;
import com.sonph.factory.constants.FactoryConstant;
import com.sonph.factory.procedure.ProcedureFactory;

public class AbstractAccountFactory implements ProcedureFactory<AccountFactory> {

    @Override
    public AccountFactory getFactory(String type) {
        if (FactoryConstant.ACCOUNT_BALANCE.equals(type))
            return new BalanceAccount();
        if (FactoryConstant.ACCOUNT_SAVING.equals(type))
            return new SavingAccount();
        if (FactoryConstant.ACCOUNT_CURRENT.equals(type))
            return new CurrentAccount();
        return null;
    }
}
