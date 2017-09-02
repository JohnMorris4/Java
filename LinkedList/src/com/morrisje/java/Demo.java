package com.morrisje.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit,"Columbia");
        addInOrder(placesToVisit,"New York");
        addInOrder(placesToVisit,"Atlanta");
        addInOrder(placesToVisit,"Washington D.C.");
        addInOrder(placesToVisit,"New Orleans");
        addInOrder(placesToVisit,"Las Vegas");
        addInOrder(placesToVisit,"Dallas");

        printList(placesToVisit);

        placesToVisit.add(3, "Dallas");
        printList(placesToVisit);

        //remove an item
        placesToVisit.remove(5);
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included");
                return false;
            } else if (comparison > 0) {
                //sort the list
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}
