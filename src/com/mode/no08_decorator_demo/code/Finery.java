package com.mode.no08_decorator_demo.code;

public abstract class Finery extends Person {

    public Person person;

    @Override
    public void show() {
        if (null != person) {
            person.show();
        }
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
