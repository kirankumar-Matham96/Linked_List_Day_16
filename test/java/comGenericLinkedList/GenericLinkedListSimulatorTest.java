package comGenericLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class GenericLinkedListSimulatorTest {
    @Test
    public void givenThreeValuesToLinkedList_testShouldPass() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        integerNode1.setNext(integerNode2);
        integerNode2.setNext(integerNode3);
        Assert.assertTrue(integerNode1.getNext().equals(integerNode2) && integerNode2.getNext().equals(integerNode3));
    }
    
    @Test
    public void givenThreeValuesToLinkedList_addsAtTheFront_testShouldPass() {
        Node<Integer> integerNode1 = new Node<>(70);
        Node<Integer> integerNode2 = new Node<>(56);
        Node<Integer> integerNode3 = new Node<>(30);
        LinkedList linkedList = new LinkedList();
        linkedList.add(integerNode1);
        linkedList.add(integerNode3);
        linkedList.add(integerNode2);
        linkedList.printNodes();
        Assert.assertTrue(LinkedList.getHead().equals(integerNode2) && LinkedList.getHead().getNext().equals(integerNode3) && LinkedList.getTail().equals(integerNode1));
    }
    
    @Test
    public void givenThreeValuesToLinkedList_addsAtTheLast_testShouldPass() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        linkedList.printNodes();
        Assert.assertTrue(LinkedList.getHead().equals(integerNode1) && LinkedList.getHead().getNext().equals(integerNode2) && LinkedList.getTail().equals(integerNode3));
    }
    
    @Test
    public void givenElementShouldBeInsertedBetweenTwoElementsPresent_shouldPassTheTest() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(integerNode1);
        linkedList.append(integerNode3);
        linkedList.insert(integerNode1, integerNode2);
        Assert.assertTrue(LinkedList.getHead().equals(integerNode1) && LinkedList.getHead().getNext().equals(integerNode2) && LinkedList.getTail().equals(integerNode3));
    }
    
    @Test
    public void givenElementShouldBeRemovedFromTheFirstInTheList_shouldPassTheTest() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        linkedList.popFirst();
        Assert.assertTrue(LinkedList.getHead().equals(integerNode2) && LinkedList.getTail().equals(integerNode3));
    }
    
    @Test
    public void givenElementShouldBeRemovedFromTheLastInTheList_shouldPassTheTest() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        linkedList.popLast();
        Assert.assertTrue(LinkedList.getHead().equals(integerNode1) && LinkedList.getTail().equals(integerNode2));
    }
    
    @Test
    public void givenValueShouldBeSearchedInTheListAndReturnsTrue_ifExists() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        Assert.assertTrue(linkedList.searchByValue(30));
    }
    
    @Test
    public void givenElementShouldGetInsertedNextToElementAfterSearchingGivenElement_shouldPassTheTest() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        Node<Integer> integerNode4 = new Node<>(40);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        linkedList.searchByKeyInserts(30, integerNode4);
        Assert.assertTrue(LinkedList.getHead().equals(integerNode1) && LinkedList.getHead().getNext().equals(integerNode2) && LinkedList.getHead().getNext().getNext().equals(integerNode4) && LinkedList.getTail().equals(integerNode3));
    }
    
    @Test
    public void size() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        Node<Integer> integerNode4 = new Node<>(40);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode3);
        linkedList.append(integerNode4);
        Assert.assertEquals(4,linkedList.size());
    }
    
    @Test
    public void searchGivenValue_deleteRespectiveNode_returnsSize() {
        Node<Integer> integerNode1 = new Node<>(56);
        Node<Integer> integerNode2 = new Node<>(30);
        Node<Integer> integerNode3 = new Node<>(70);
        Node<Integer> integerNode4 = new Node<>(40);
        LinkedList linkedList = new LinkedList();
        linkedList.append(integerNode1);
        linkedList.append(integerNode2);
        linkedList.append(integerNode4);
        linkedList.append(integerNode3);
        Assert.assertEquals(4,linkedList.size());
        linkedList.searchByValueAndDelete(40);
        Assert.assertEquals(3,linkedList.size());
    }
}
