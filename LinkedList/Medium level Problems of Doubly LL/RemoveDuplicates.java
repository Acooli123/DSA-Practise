class RemoveDuplicates {
    Node head;

    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                Node duplicate = current.next;

                current.next = duplicate.next;

                if (duplicate.next != null) {
                    duplicate.next.prev = current;
                }
            } else {
                current = current.next;
            }
        }
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
        RemoveDuplicates list = new RemoveDuplicates();

        list.head = new Node(1);

        list.head.next = new Node(1);
        list.head.next.prev = list.head;

        list.head.next.next = new Node(5);
        list.head.next.next.prev = list.head.next;

        list.head.next.next.next = new Node(5);
        list.head.next.next.next.prev = list.head.next.next;

        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.prev = list.head.next.next.next;

        list.removeDuplicates();

        list.printList();
    }
}