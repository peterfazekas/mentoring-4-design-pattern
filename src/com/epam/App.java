package com.epam;

import com.epam.adapter.StackList;
import com.epam.iterator.LifoList;

import java.util.*;

public class App {

    public static void main(String args[]) {
        App app = new App();
        app.iteratorDemo();
        app.adapterDemo(new ArrayList<>());
        app.adapterDemo(new Vector<>());
    }

    private void iteratorDemo() {
        System.out.println("Iterator design patter demo:");
        demoIteratorPattern(Arrays.asList(-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        demoIteratorPattern(Arrays.asList("minus_one", "zero", "one", "two", "three", "four", "five"));
    }

    private <E> void demoIteratorPattern(final List<E> list) {
        LifoList<E> lifoListNumbers = new LifoList<>(list);
        Iterator<E> iterator = lifoListNumbers.createIterator();
        iterator.remove();
        printList(iterator);
    }

    private void adapterDemo(final List<Integer> list) {
        System.out.println("Adapter design patter demo:");
        StackList<Integer> stackList = new StackList<>(list);
        stackList.push(11);
        printList(stackList.createIterator());
        stackList.push(8);
        stackList.push(5);
        printList(stackList.createIterator());
        stackList.push(3);
        printList(stackList.createIterator());
        stackList.pop();
        stackList.pop();
        printList(stackList.createIterator());
        stackList.pop();
        printList(stackList.createIterator());
    }

    private <E> void printList(final Iterator<E> iterator) {
        while (iterator.hasNext()) {
            E menuItem = iterator.next();
            System.out.print(menuItem + " ");
        }
        System.out.println();
    }

}
