package com.epam.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackList<E> implements Stack<E> {

    private final List<E> list;

    public StackList() {
        list = new ArrayList<>();
    }

    public StackList(final List<E> list) {
        this.list = list;
    }


    @Override
    public void push(E item) {
        list.add(item);
    }

    @Override
    public E pop() {
        return list.size() > 0 ? list.remove(list.size() - 1) : null;
    }

    public Iterator<E> createIterator() {
        return list.iterator();
    }

}
