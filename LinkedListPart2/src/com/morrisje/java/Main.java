package com.morrisje.java;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {



    public static void main(String[] args) {
	// write your code here
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Montana");
        states.add("Wyoming");
        states.add("South Carolina");

        states.addFirst("Colorado");
        System.out.println(states);

        ListIterator iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
