package com.mode.no17_iterator_demo.code;

public class NameRepository implements Container {

    public String[] name = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < name.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[index++];
            } else {
                return null;
            }
        }
    }
}
