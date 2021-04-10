package comGenericLinkedList;

/**
 * Assigns heads and tails of each memory block
 *
 * @param <L> generic type
 */
public class Node<L> implements INode<L> {
    private L key;
    private INode next;
    
    public Node(L key) {
        this.key = key;
        this.next = null;
    }
    
    public L getKey() {
        return key;
    }
    
    public void setKey(L key) {
        this.key = key;
    }
    
    public INode getNext() {
        return next;
    }
    
    public void setNext(INode next) {
        this.next = (Node<L>) next;
    }
    
    @Override
    public String toString() {
        return "Node{" + "key=" + key + ", next=" + next + '}';
    }
}
