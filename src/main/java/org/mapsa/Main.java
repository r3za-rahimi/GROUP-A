package org.mapsa;

public class Main {
    public static void main(String[] args) {
        System.out.println(Mapsa.unique("abcdefghf")); //false
        System.out.println(Mapsa.unique("abcdefgh")); //true
        System.out.println(Mapsa.timeArrayList());
        System.out.println(Mapsa.timeHashSet());
        System.out.println(Mapsa.timeLinkedList());

    }
}