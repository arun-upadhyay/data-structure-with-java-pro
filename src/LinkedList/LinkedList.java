package LinkedList;

public class LinkedList {
    private String data;
    private LinkedList next;

    public LinkedList(String data, LinkedList link) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data;
    }
}
