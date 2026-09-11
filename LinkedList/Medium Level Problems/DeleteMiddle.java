class DeleteMiddle {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void deleteMiddle(){
        if(head == null || head.next == null)   return;

        Node slow = head;
        Node fast = head;
        Node current = null;

        while(fast != null && fast.next != null){
            current = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Node current = head;

        // while(current.next != slow){
        //     current = current.next;
        // }

        current.next = slow.next;
    }

    public void printList(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DeleteMiddle list = new DeleteMiddle();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);

        list.deleteMiddle();

        list.printList();
    }
}