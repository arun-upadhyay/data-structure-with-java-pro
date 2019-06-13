package LinkedList;

public class LinkedListOperation {
    // hold the pointer of last first node
    private LinkedList first = null;
    // hold the pointer of last node.
    private LinkedList last = null;

    public static void main(String[] args) {
        LinkedListOperation linkedListOperation = new LinkedListOperation();
        linkedListOperation.addItemToLinkedList("NH");
        linkedListOperation.addItemToLinkedList("NK");
        linkedListOperation.addItemToLinkedList("PA");
        // show all contents of LinkedList
        linkedListOperation.showLinkedList();
        // Add new element at the end
        linkedListOperation.addItemToLinkedList("CA");
        // show the contents
        linkedListOperation.showLinkedList();
        // Delete first element
        linkedListOperation.deleteFirstElement("NH");
        // show the contents
        linkedListOperation.showLinkedList();
        // delete last element
        linkedListOperation.deleteLastElement("CA");
        // show the contents
        linkedListOperation.showLinkedList();

    }

    /**
     * Add new element at the end in the LinkedList
     *
     * @param data
     */
    void addItemToLinkedList(String data) {
        LinkedList newList = new LinkedList(data, null);
        if (first == null) {
            first = last = newList;
        } else {
            last.setNext(newList);
            last = newList;
        }
    }

    /**
     * show contents of LinkedList
     */
    void showLinkedList() {
        System.out.println();
        if (first == null) {
            System.out.println("Empty LinkedList");
            return;
        }
        LinkedList ptr = first;
        while (ptr != null) {
            if (ptr.getNext() == null) {
                System.out.print(ptr.getData());
            } else {
                System.out.print(ptr.getData() + ">>");
            }
            ptr = ptr.getNext();
        }
    }

    /**
     * Delete first Element
     *
     * @param item
     */
    void deleteFirstElement(String item) {

        if (first == null) {
            System.out.println("LinkedList is empty!");
        }
        if(first.getData() != item){
            System.out.println(item + " is not a first element");
        }
        LinkedList temp = first;
        first = first.getNext();
        temp = null;
    }

    void deleteLastElement(String item){
        if(last == null ){
            System.out.println("LinkedList is empty!");
        }
        if(first == last){
            first = last = null;
        }
        LinkedList ptr = first;

        while (ptr.getNext() != last){
            ptr = ptr.getNext();
        }
        last = ptr;
        last.setNext(null);

    }
}
