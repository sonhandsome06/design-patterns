package com.sonph.factory.procedure;

public interface ProcedureFactory<T> {

    T getFactory(String type);
}
