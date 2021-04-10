package comGenericLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class GenericLinkedListSimulatorTest {
    @Test
    public void givenThreeValuesToLinkedList_testShouldPass() {
        Node<Integer> integerNode1 = new Node<Integer>(56);
        Node<Integer> integerNode2 = new Node<Integer>(30);
        Node<Integer> integerNode3 = new Node<Integer>(70);
        integerNode1.next = integerNode2;
        integerNode2.next = integerNode3;
        Assert.assertTrue(integerNode1.next.equals(integerNode2) && integerNode2.next.equals(integerNode3));
    }
}
