package com.mode.no17_iterator_demo.test;

import com.mode.no17_iterator_demo.code.Iterator;
import com.mode.no17_iterator_demo.code.NameRepository;

public class IteratorTest {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();

        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            System.out.println("name:" + next);
        }
    }
}
