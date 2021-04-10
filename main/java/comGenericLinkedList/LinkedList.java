package comGenericLinkedList;

public class LinkedList {
    private static INode head;
    private static INode tail;
    
    /**
     * gets head
     * @return
     */
    public static INode getHead() {
        return head;
    }
    
    /**
     * gets tail
     * @return
     */
    public static INode getTail() {
        return tail;
    }
    
    /**
     * constructor to set null initially
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    /**
     * Adds the element at front
     * @param newNode new element
     */
    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null){
            this.head = newNode;
        }else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    
    /**
     * Adds element at the end (append)
     * @param newNode new element
     */
    public void append(INode newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null){
            this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    
    /**
     * adds element in between two existing nodes
     * @param previousNode node at which the new element to be added
     * @param newNode new element
     */
    public void insert(INode previousNode, INode newNode) {
        INode tempNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    
    /**
     * Prints all the nodes in sequence
     */
    public void printNodes(){
        StringBuffer availableNodes = new StringBuffer("Nodes : ");
        INode tempNode = head;
        while(tempNode.getNext() != null){
            availableNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)){
                availableNodes.append(" points to ");
            }
            tempNode = tempNode.getNext();
        }
        availableNodes.append(tempNode.getKey());
        System.out.println(availableNodes);
    }
    
    /**
     * removes the first element from the list
     */
    public void pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
    }
}
