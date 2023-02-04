import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkList1 {
    private LinkedList<Integer> linkedList = new LinkedList<>();


    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public LinkedList add() {
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    public void remove() {
        for (int i = 499999; i >0; i--) {
            linkedList.remove(i);
        }

    }

    @Override
    public String toString() {
        return "LinkList1{" +
                "linkedList=" + linkedList +
                '}';
    }
}
