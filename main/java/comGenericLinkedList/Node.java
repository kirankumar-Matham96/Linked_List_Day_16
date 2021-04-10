package comGenericLinkedList;

/**
 * Assigns heads and tails of each memory block
 *
 * @param <L> generic type
 */
public class Node<L> {
    L key;
    Node<L> next;
    
    public Node() {
        this.key = null;
        this.next = null;
    }
    
    public Node(L key) {
        this.key = key;
        this.next = null;
    }
}
