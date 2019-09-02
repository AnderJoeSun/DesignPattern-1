package com.myj.designpattern.DesignPattern.Visitor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by maoyujiao on 2019/9/2.
 */

public class ObjectStructer {
    private List<Person> persons = new LinkedList<>();
//    private ArrayList<Person> persons = new ArrayList<>();

    public void attach(Person person){
        persons.add(person);
    }

    public void detatch(Person person){
        persons.remove(person);
    }

    public void display(Action action){
        for(Person person:persons){
            person.accept(action);
        }
    }
}
