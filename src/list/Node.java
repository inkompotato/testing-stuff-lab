package list;

public class Node <E>{
    Node <E> next;
    E data;

    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public void deleteNext(){
        this.next = next.next;
    }

    public void reverse(){

    }

    public String toString() {
        if (next == null)
            return data.toString();
        else
            return data.toString() + ", " + next.toString();
    }


}
