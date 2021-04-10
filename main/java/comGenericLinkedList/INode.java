package comGenericLinkedList;

public interface INode<L> {
    
    L getKey();
    void setKey(L key);
    INode getNext();
    String toString();
    void setNext(INode next);
}
