package comGenericLinkedList;

public class LinkedListInternal<L> {
    Node<L> head;
    
    /**
     * adds element at the end
     * @param key value of element
     */
    public void add(L key) {
        Node<L> newNode = new Node<>();
        newNode.key = key;
        if(head == null) {
            head = newNode;
        } else {
            Node<L> n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }
    
    /**
     * adds element at required position
     * @param index index value at which element should be added
     * @param key value of element
     */
    public void add(int index, L key) {
        Node<L> newNode = new Node<>();
        newNode.key = key;
        if(index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<L> headNodes = head;
            for(int i = 0; i < index - 1; i++) {
                headNodes = headNodes.next;
            }
            newNode.next = headNodes;
            headNodes.next = newNode;
        }
    }
    
    /**
     * calculates the size of list
     * @return returns number of elements(size)
     */
    public int size() {
        int size = 0;
        if(head == null) {
            return size;
        }
        Node<L> headNodes = head;
        while(headNodes.next != null) {
            headNodes = headNodes.next;
            size++;
        }
        return ++size;
    }
    
    /**
     * removes element from list depending on index value given
     * @param index index value of the element to be removed
     */
    public void remove(int index) {
        if(index == 0) {
            head = head.next;
        } else {
            Node<L> headNodes = head;
            Node<L> emptyNode = null;
            for(int i = 0; i < index - 1; i++) {
                headNodes = headNodes.next;
            }
            emptyNode = headNodes.next;
            headNodes.next = emptyNode.next;
            System.out.println("node deleted: " + emptyNode.key);
        }
    }
    
    /**
     * prints all the elements in the list
     */
    public void printElements() {
        if(head == null) {
            System.out.println("Empty");
        }
        Node<L> headNodes = head;
        while(headNodes.next != null) {
            System.out.println("values: " + headNodes.key);
            headNodes = headNodes.next;
        }
        System.out.println("values: " + headNodes.key);
    }
}
