package com.sonph.factory.abtracts;

import com.sonph.factory.banks.BankFactory;
import com.sonph.factory.banks.ShbBank;
import com.sonph.factory.banks.TechComBank;
import com.sonph.factory.banks.VietComBank;
import com.sonph.factory.constants.FactoryConstant;
import com.sonph.factory.procedure.ProcedureFactory;

public class AbstractBankFactory implements ProcedureFactory<BankFactory> {
    @Override
    public BankFactory getFactory(String type) {
        if (FactoryConstant.BANK_SHB.equals(type)) return new ShbBank();
        if (FactoryConstant.BANK_TECH.equals(type)) return new TechComBank();
        if (FactoryConstant.BANK_VCB.equals(type)) return new VietComBank();
        return null;
    }
}
