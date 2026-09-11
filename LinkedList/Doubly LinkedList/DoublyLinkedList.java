class DoublyLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void deleteHead(){
        if(head == null || head.next == null)   return;

        head = head.next;
    }


    // Highly Important function*****
    public void reverseList(){
        if(head == null || head.next == null)   return;

        Node prevNode = head;
        Node current = head.next;

        while(current != null){
            Node nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public void printList(){
        Node current = head;

        while(current != null){
            System.out.print(current.data +"-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addFront(5);
        list.addFront(4);
        list.addFront(3);
        list.addFront(2);
        list.addFront(1);

        list.deleteHead();

        list.reverseList();

        list.printList();
    }
}