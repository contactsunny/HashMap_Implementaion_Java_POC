package com.contactsunny.poc.HashMapImplementation;

import com.contactsunny.poc.HashMapImplementation.exceptions.InvalidIndexException;
import com.contactsunny.poc.HashMapImplementation.hashMap.HashMap;

public class App {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        try {
            hashMap.put(1, "One");
            hashMap.put(2, "Two");
            hashMap.put(21, "Twenty One");
            hashMap.put(22, "Twenty Two");
            hashMap.put(23, "Twenty Three");
            hashMap.put(256, "Two Hundred And Fifty Six");

            hashMap.printHashMap();
        } catch (InvalidIndexException e) {
            e.printStackTrace();
        }

        HashMap<String, String> stringHashMap = new HashMap<>();

        try {
            stringHashMap.put("One", "One");
            stringHashMap.put("Two", "Two");
            stringHashMap.put("Three", "Twenty One");
            stringHashMap.put("Four", "Twenty Two");
            stringHashMap.put("Five", "Twenty Three");
            stringHashMap.put("Six", "Two Hundred And Fifty Six");

            stringHashMap.printHashMap();
        } catch (InvalidIndexException e) {
            e.printStackTrace();
        }
    }
}
