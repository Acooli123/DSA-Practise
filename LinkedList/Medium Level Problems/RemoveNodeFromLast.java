class RemoveNodeFromLast {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void removeNthNodeFromLast(int n){
        if(head.next == null)   return;

        int size = 0;
        Node current = head;
        while(current != null){
            size++;
            current = current.next;
        }

        int idxToSearch = size - n - 1;
        Node ptr = head;
        int i = 0;

        while(i < idxToSearch){
            ptr = ptr.next;
            i++;
        }
        ptr.next = ptr.next.next;
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
        RemoveNodeFromLast list = new RemoveNodeFromLast();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        int n = 2;

        list.removeNthNodeFromLast(n);

        list.printList();
    }
}