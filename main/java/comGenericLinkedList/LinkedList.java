package comGenericLinkedList;

public class LinkedList {
    private static INode head;
    private static INode tail;
    
    /**
     * gets head
     *
     * @return
     */
    public static INode getHead() {
        return head;
    }
    
    /**
     * gets tail
     *
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
     *
     * @param newNode new element
     */
    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    
    /**
     * Adds element at the end (append)
     *
     * @param newNode new element
     */
    public void append(INode newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    
    /**
     * adds element in between two existing nodes
     *
     * @param previousNode node at which the new element to be added
     * @param newNode      new element
     */
    public void insert(INode previousNode, INode newNode) {
        INode tempNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(tempNode);
        printNodes();
    }
    
    /**
     * removes the first element from the list
     */
    public void popFirst() {
        INode tempNode = this.head;
        this.head = head.getNext();
    }
    
    /**
     * removes the last element from the list
     */
    public void popLast() {
        INode tempNode = head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
    }
    
    /**
     * Searches value in the list
     *
     * @param keyValue value to search
     * @return returns boolean
     */
    public boolean searchByValue(int keyValue) {
        if(head == null) {
            return false;
        }
        INode tempNode = head;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey().equals(keyValue)) {
                System.out.println("Found!");
                return true;
            }
            tempNode = tempNode.getNext();
        }
        System.out.println("Not found!");
        return false;
    }
    
    /**
     * Search node by value and inserts new node
     *
     * @param valueToFind    key value to find respective node
     * @param valueToAddNext new node to insert
     */
    public void searchByKeyInserts(Integer valueToFind, INode<Integer> valueToAddNext) {
        INode tempNode = head;
        boolean found = true;
        while(!tempNode.getNext().equals(null)) {
            if(tempNode.getKey().equals(valueToFind)) {
                INode nodeTemp = tempNode.getNext();
                tempNode.setNext(valueToAddNext);
                valueToAddNext.setNext(nodeTemp);
                found = false;
                break;
            }
            tempNode = tempNode.getNext();
        }
        if(found) {
            System.out.println("Not found!");
        }
    }
    
    /**
     * finds the size of list
     *
     * @return size
     */
    public int size() {
        int size = 1;
        
        INode tempNode = head;
        try {
            while(!tempNode.getNext().equals(null)) {
                size++;
                tempNode = tempNode.getNext();
            }
        } catch(NullPointerException nullException) {
        }
        return size;
    }
    
    public void searchByValueAndDelete(Integer valueToDelete) {
        if(head == null) {
            System.out.println("List is empty!");
        } else {
            INode tempNode = head;
            while(tempNode.getNext() != null) {
                if(tempNode.getNext().getKey().equals(valueToDelete)) {
                    tempNode.setNext(tempNode.getNext().getNext());
                    break;
                }
                tempNode = tempNode.getNext();
            }
        }
    }
    
    /**
     * Prints all the nodes in sequence
     */
    public void printNodes() {
        StringBuffer availableNodes = new StringBuffer("Nodes : ");
        INode tempNode = head;
        while(tempNode.getNext() != null) {
            availableNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) {
                availableNodes.append(" -> ");
            }
            tempNode = tempNode.getNext();
        }
        availableNodes.append(tempNode.getKey());
        System.out.println(availableNodes);
    }
}
