package comGenericLinkedList;

public class GenericLinkedListSimulator {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Simulator!");
        
        //adding values to the different lists
        Node<Integer> node1 = new Node<>(30);
        Node<Integer> node2 = new Node<>(56);
        Node<Integer> node3 = new Node<>(70);
        
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
        
        //linked the first list to the second list
        node1.next = node2;
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
        
        //linked the second list to the third list
        node2.next = node3;
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
    }
}
