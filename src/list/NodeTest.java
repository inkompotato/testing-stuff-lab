package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    private Node<String> firstNode;
    private Node<String> secondNode;
    private Node<String> thirdNode;
    private Node<String> lastNode;

    @BeforeEach
    public void setUp() {
        lastNode = new Node <>("four", null); //this node is the EOL as it has no next.
        thirdNode = new Node <>("three", lastNode);
        secondNode = new Node<>("two", thirdNode);
        firstNode = new Node<>("one", secondNode);
    }

    @Test
    public void testOrder(){
        assert(firstNode.next == secondNode);
    }

    @Test
    public void testDeleteNextMultipleTimes() {
        // Setup

        // Run the test
        firstNode.deleteNext();
        firstNode.deleteNext();

        // Verify the results
        assert(firstNode.next == lastNode);
    }

    @Test
    public void testDeleteNext() {
        // Setup

        // Run the test
        firstNode.deleteNext();

        // Verify the results
        assert(firstNode.next == thirdNode);
    }



//    @Test
//    public void testToString() {
//        // Setup
//        final String expectedResult = "result";
//
//        // Run the test
//        final String result = firstNode.toString();
//
//        // Verify the results
//        assertEquals(expectedResult, result);
//    }
}
