class FindPairsOfGivenSum {
    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void findPairs(Node head, int sum) {
        Node ptr1 = head;

        System.out.println("Pairs of the given sum are:");

        while (ptr1 != null) {
            Node ptr2 = ptr1.next;

            while (ptr2 != null) {
                int pairSum = ptr1.data + ptr2.data;

                if (pairSum == sum) {
                    System.out.println("(" + ptr1.data + ", " + ptr2.data + ")");
                } else if (pairSum > sum) {
                    break; // valid only because list is sorted
                }

                ptr2 = ptr2.next;
            }

            ptr1 = ptr1.next;
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
        FindPairsOfGivenSum list = new FindPairsOfGivenSum();

        list.head = new Node(1);

        list.head.next = new Node(2);
        list.head.next.prev = list.head;

        list.head.next.next = new Node(3);
        list.head.next.next.prev = list.head.next;

        list.head.next.next.next = new Node(4);
        list.head.next.next.next.prev = list.head.next.next;

        list.head.next.next.next.next = new Node(7);
        list.head.next.next.next.next.prev = list.head.next.next.next;

        list.printList();

        list.findPairs(list.head, 5);
    }
}