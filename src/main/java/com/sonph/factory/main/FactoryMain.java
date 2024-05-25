package com.sonph.factory.main;

import com.sonph.factory.banks.BankFactory;
import com.sonph.factory.constants.FactoryConstant;

public class FactoryMain {

    public static void main(String[] args) {
        BankFactory bankFactory = (BankFactory) ProviderFactory.createAbstractFactory(FactoryConstant.BANK_FACTORY).getFactory(FactoryConstant.BANK_TECH);
        System.out.println(bankFactory.getBankName());

    }

}
