class FindMiddle {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printList(){
        Node current = head;

        while(current != null){
            System.out.print(current.data +"-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public Node findMiddle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        FindMiddle list = new FindMiddle();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.printList();

        Node middle = list.findMiddle();

        System.out.println("Middle element of the list is : " + middle.data);
    }
}