package org.mapsa.Q34;

public class LinkList {

    private Node root;
    private int size;

    public LinkList() {
        this.root = new Node();
        this.size = 0;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    void appendToTail(int value) {
        Node nextNode = new Node(root, value);
        root = nextNode;
        size++;
    }


    public Node remove(Node node, int value) {

        Node thisNode = node;
        Node pervNode = null;

        while (thisNode != null) {

            if (thisNode.getData() == value) {

                pervNode.setNext(thisNode.getNext());
                size--;
                break;
            }
            pervNode = thisNode;
            thisNode = thisNode.getNext();

        }

        return root;

    }


    @Override
    public String toString() {
        return "LinkList{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }
}
