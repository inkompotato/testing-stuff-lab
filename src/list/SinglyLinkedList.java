package list;

public class SinglyLinkedList {

    private Node first;
    private Node current;
    private Node previous;
    int size = 0;

    public void add(Node node) {
        if (first == null) {
            addFirst(node);
        }
        else {
            current.next = node;
            size++;
        }

    }

    public void addFirst(Node node) {
        if (first == null) {
            first = node;
            previous = null;
            current = first;
            size= 1;
        }
        else {
            first = node;
            current = first;
            size++;
        }
    }

//    public void reverse(){
//            previous = null;
//            current = first;
//            Node next = null;
//            while (current != null) {
//                next = current.next;
//                current.next = previous;
//                previous = current;
//                current = next;
//            }
//            first = previous;
//    }

    void reverse(){
        first = reverseLogic(first);
    }

    Node reverseLogic(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void next() {
        current = current.next;
        if ( previous == null) previous = first;
        else previous = previous.next;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public Node current() {
        return current;
    }


    public int getSize() {
        return size;
    }


    public void reset() {
        current = first;
        previous = null;
    }


    public boolean endoflist() {
        return (current == null);
    }

    public String printList() {
        String s ="[";
        this.reset();
        while (!endoflist()) {
            s += current.data+"; ";
            this.next();
        }
        return s + "]";
    }
}
