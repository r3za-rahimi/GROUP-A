package org.mapsa.Q34;

public class MainClass {

    public static void main(String[] args) {

        LinkList linkList = new LinkList();

        linkList.appendToTail(5);
        linkList.appendToTail(6);
        linkList.appendToTail(7);
        linkList.appendToTail(8);

        System.out.println(linkList.toString());


//        linkList.setRoot(linkList.remove(linkList.getRoot(), 5));
        linkList.remove(linkList.getRoot(), 6);


        System.out.println(linkList.toString());
    }
}
