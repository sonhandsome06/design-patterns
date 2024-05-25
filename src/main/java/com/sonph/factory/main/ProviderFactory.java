package com.sonph.factory.main;

import com.sonph.factory.abtracts.AbstractAccountFactory;
import com.sonph.factory.abtracts.AbstractBankFactory;
import com.sonph.factory.constants.FactoryConstant;
import com.sonph.factory.procedure.ProcedureFactory;

public class ProviderFactory {

    public static ProcedureFactory createAbstractFactory(String typeFactory) {
        if(typeFactory.equals(FactoryConstant.BANK_FACTORY))
            return new AbstractBankFactory();
        else
            return new AbstractAccountFactory();
    }
}
