package comGenericLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class GenericLinkedListSimulatorTest {
    @Test
    public void givenThreeValuesToLinkedList_testShouldPass() {
        Node<Integer> integerNode1 = new Node<Integer>(56);
        Node<Integer> integerNode2 = new Node<Integer>(30);
        Node<Integer> integerNode3 = new Node<Integer>(70);
        integerNode1.setNext(integerNode2);
        integerNode2.setNext(integerNode3);
        Assert.assertTrue(integerNode1.getNext().equals(integerNode2) && integerNode2.getNext().equals(integerNode3));
    }
    
    @Test
    public void givenThreeValuesToLinkedList_addsAtTheFront_testShouldPass() {
        Node<Integer> integerNode1 = new Node<Integer>(70);
        Node<Integer> integerNode2 = new Node<Integer>(56);
        Node<Integer> integerNode3 = new Node<Integer>(30);
        LinkedList linkedList = new LinkedList();
        linkedList.add(integerNode1);
        linkedList.add(integerNode3);
        linkedList.add(integerNode2);
        linkedList.printNodes();
        Assert.assertTrue(LinkedList.getHead().equals(integerNode2) && LinkedList.getHead().getNext().equals(integerNode3) && LinkedList.getTail().equals(integerNode1));
    }
    
    @Test
    public void givenThreeValuesToLinkedList_addsAtTheLast_testShouldPass() {
        Node<Integer> integerNode1 = new Node<Integer>(56);
        Node<Integer> integerNode2 = new Node<Integer>(30);
        Node<Integer> integerNode3 = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        linkedList.printNodes();
        Assert.assertTrue(LinkedList.getHead().equals(integerNode1) && LinkedList.getHead().getNext().equals(integerNode2) && LinkedList.getTail().equals(integerNode3));
    }
    
    @Test
    public void givenElementShouldBeInsertedBetweenTwoElementsPresent_shouldPassTheTest() {
        Node<Integer> integerNode1 = new Node<Integer>(56);
        Node<Integer> integerNode2 = new Node<Integer>(30);
        Node<Integer> integerNode3 = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(integerNode1);
        linkedList.append(integerNode3);
        linkedList.insert(integerNode1, integerNode2);
        Assert.assertTrue(LinkedList.getHead().equals(integerNode1) && LinkedList.getHead().getNext().equals(integerNode2) && LinkedList.getTail().equals(integerNode3));
    }
    
    @Test
    public void givenElementShouldBeRemovedFromTheFirstInTheList_shouldPassTheTest() {
        Node<Integer> integerNode1 = new Node<Integer>(56);
        Node<Integer> integerNode2 = new Node<Integer>(30);
        Node<Integer> integerNode3 = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        linkedList.pop();
        Assert.assertTrue(LinkedList.getHead().equals(integerNode2) && LinkedList.getTail().equals(integerNode3));
    }
    
    @Test
    public void givenElementShouldBeRemovedFromTheLastInTheList_shouldPassTheTest() {
        Node<Integer> integerNode1 = new Node<Integer>(56);
        Node<Integer> integerNode2 = new Node<Integer>(30);
        Node<Integer> integerNode3 = new Node<Integer>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        linkedList.popLast();
        Assert.assertTrue(LinkedList.getHead().equals(integerNode1) && LinkedList.getTail().equals(integerNode2));
    }
}
