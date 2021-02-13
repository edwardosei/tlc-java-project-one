package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Bag<People> {

    private List<People> people = new ArrayList<>();

    public void add(People person) {

        this.people.add(person);

    }

    public void remove(People person) {
        this.people.remove(person);
    }

    public void clear() {
        this.people.clear();
    }

}
