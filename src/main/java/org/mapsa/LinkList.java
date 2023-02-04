package org.mapsa;

public class LinkList {
    private Node head ;
    private int size ;
    public LinkList(){
        size = 0 ;
        head = null ;
    }
    public boolean isEmpty(){
        return head==null ;
    }
    public void add(int d){
        Node oldHead = head ;
        head = new Node(d,oldHead) ;
        size++ ;
    }

    /**
     *
     *طبق گفته صورت سوال انجام نشده
     * تکمیل شود
     *
     */
    public void delete(int key)
    {
        Node temp = head ;
        Node prev = null;

        if (temp != null && temp.getData() == key) {
            head = temp.getNext();
            return;
        }

        while (temp != null && temp.getData() != key) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null)
            return;
       // prev.getNext() = temp.getNext();
    }
}
