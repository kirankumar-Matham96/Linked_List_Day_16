package comGenericLinkedList;

public class LinkedList {
    private static INode head;
    private static INode tail;
    
    public static INode getHead() {
        return head;
    }
    
    public static INode getTail() {
        return tail;
    }
    
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    
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
}
