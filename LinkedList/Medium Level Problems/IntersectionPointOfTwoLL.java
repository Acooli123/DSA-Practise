class IntersectionPointOfTwoLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // very very important code******
    public Node intersectionOfTwoLL(Node head1, Node head2){
        Node l1 = head1;
        Node l2 = head2;

        if(l1 == null || l2 == null)  return null;

        while(l1 != l2){
            l1 = (l1 == null) ? head2 : l1.next;
            l2 = (l2 == null) ? head1 : l2.next;
        }

        return l1;
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
        IntersectionPointOfTwoLL l1 = new IntersectionPointOfTwoLL();
        IntersectionPointOfTwoLL l2 = new IntersectionPointOfTwoLL();

        Node common = new Node(5);
        common.next = new Node(6);

        l1.head = new Node(1);
        l1.head.next = new Node(2);
        l1.head.next.next = common;

        l2.head = new Node(1);
        l2.head.next = new Node(2);
        l2.head.next.next = new Node(3);
        l2.head.next.next.next = new Node(4);
        l2.head.next.next.next.next = common;

        System.out.println("There are two list : ");
        l1.printList();
        l2.printList();

        Node res = l2.intersectionOfTwoLL(l1.head, l2.head);

        System.out.println("Intersection point is : " + res.data);
    }
}