class ReverseList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void reverseIterativeList(){
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

    public Node reverseRecursiveList(Node head){
       if(head == null || head.next == null)   return head;

        Node newHead = reverseRecursiveList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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
        ReverseList list = new ReverseList();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.reverseIterativeList();
        // list.head = list.reverseRecursiveList(list.head);

        list.printList();

    }
}