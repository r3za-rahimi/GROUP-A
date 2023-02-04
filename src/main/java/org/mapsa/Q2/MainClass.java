package org.mapsa.Q2;

import java.util.Hashtable;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(isUnique("salam"));

    }


    public static boolean isUnique(String str) {
        Hashtable<Integer, Character> hashtable = new Hashtable<>();


        str.chars().forEach(x -> hashtable.put(x, (char)x));

        return str.length() == hashtable.size();

    }
}
