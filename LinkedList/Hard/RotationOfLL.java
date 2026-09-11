class RotationOfLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node rotateKSteps(Node head, int k){
        if(head == null || head.next == null || k == 0) return head;

        Node tail = head;
        int size = 1;

        while(tail.next != null){
            tail = tail.next;
            size++;
        }

        tail.next = head;
        k = k % size;

        int stepToNewTail = size - k;
        Node newTail = head;

        for(int i=1; i<stepToNewTail; i++){
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
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
        RotationOfLL list = new RotationOfLL();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        int k = 15;

        Node res = list.rotateKSteps(list.head, k);
        list.head = res;

        list.printList();
    }
}