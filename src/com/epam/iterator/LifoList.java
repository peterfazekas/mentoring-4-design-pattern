package com.epam.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LifoList<E> {

    final List<E> list;

    public LifoList() {
        list = new ArrayList<>();
    }

    public LifoList(final List<E> otherList) {
        this();
        addAll(otherList);
    }

    public void addItem(final E element) {
        list.add(element);
    }

    public void addAll(final List<E> otherList) {
        list.addAll(otherList);
    }
    public List<E> getList() {
        return list;
    }

    public Iterator<E> createIterator() {
        return new LifoIterator<>(list);
    }

}
