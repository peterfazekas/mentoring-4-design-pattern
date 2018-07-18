package com.epam.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class LifoIterator<E> implements Iterator<E> {

    private List<E> list;
    int position;

    public LifoIterator(final List<E> list) {
        this.list = list;
        position = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return hasItems();
    }

    @Override
    public E next() {
        E menuItem = list.get(position);
        position-- ;
        return menuItem;
    }

    @Override
    public void remove() {
        if(!hasItems()) {
            throw new NoSuchElementException("There is no such item");
        }
        list.remove(0);
        position--;
    }

    private boolean hasItems() {
        return !(position < 0 || list.get(position) == null);
    }
}
