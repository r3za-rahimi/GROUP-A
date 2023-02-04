package org.mapsa.Q34;

public class MainClass {

    public static void main(String[] args) {

        LinkList linkList = new LinkList();

        linkList.appendToTail(5);
        linkList.appendToTail(6);
        linkList.appendToTail(7);
        linkList.appendToTail(8);

        System.out.println(linkList.toString());

        Node a = linkList.getRoot();

        linkList.remove(a,  7);


        System.out.println(a);
    }
}
