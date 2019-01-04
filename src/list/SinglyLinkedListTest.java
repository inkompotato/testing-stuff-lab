package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyLinkedListTest {

    private SinglyLinkedList singlyLinkedListUnderTest;

    @BeforeEach
    public void setUp() {
        singlyLinkedListUnderTest = new SinglyLinkedList();
    }

    @Test
    public void testAdd() {
        // Setup
        Node node = new Node<>("hello");

        // Run the test
        singlyLinkedListUnderTest.add(node);

        // Verify the results
        assert(singlyLinkedListUnderTest.current() == node);
    }

    @Test
    public void testReverse(){
        // Setup
        int listsize = 6;
        for (int i = 0; i < listsize; i++) {
            singlyLinkedListUnderTest.add(new Node<>("node "+i));
        }
        // Run the test
        System.out.println(singlyLinkedListUnderTest.printList());
        singlyLinkedListUnderTest.reverse();
        System.out.println(singlyLinkedListUnderTest.printList());

        // Verify the results
        //first one equals the last one
        singlyLinkedListUnderTest.reset();
        assert(singlyLinkedListUnderTest.current().data == "node "+(listsize-1));
        assert(singlyLinkedListUnderTest.current().next.data == "node "+(listsize-2));

    }
}
