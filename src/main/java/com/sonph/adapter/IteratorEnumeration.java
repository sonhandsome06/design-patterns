package com.sonph.adapter;

import java.util.*;

public class IteratorEnumeration implements Enumeration {

    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Hashtable hashtable = new Hashtable();
        hashtable.elements();

        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(arrayList.iterator());
        while (iteratorEnumeration.hasMoreElements())
            System.out.println(iteratorEnumeration.nextElement());
    }
}
