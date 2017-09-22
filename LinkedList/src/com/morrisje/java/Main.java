package com.morrisje.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("John", 18.75);
        Customer customer1 = new Customer("Buddy", 9.25);
        Customer customer2;
        customer2 = customer1;
        customer2.setBalance(16.85);
        System.out.println("Balance for Customer 2 " + customer2.getName() + " and has a balance of " + customer2.getBalance());
        // write your code here

        ArrayList<Integer> intList = new ArrayList<Integer>();


        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
