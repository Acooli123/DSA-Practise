class FlattenDoublyLL {
    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;
        Node child;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
            this.child = null;
        }
    }

    public Node flattenLL(Node head){
        if(head == null)   return null;

        Node curr = head;
        while(curr != null){
            if(curr.child != null){
                Node nextNode = curr.next;
                
                Node childNode = flattenLL(curr.child);
                curr.next = childNode;
                childNode.prev = curr;

                while(curr.next != null){
                    curr = curr.next;
                }

                if(nextNode != null){
                    curr.next = nextNode;
                    nextNode.prev = curr;
                }
            }
            curr = curr.next;
        }

        return head;
    }

    public void printList(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + "<-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        FlattenDoublyLL list = new FlattenDoublyLL();

        list.head = new Node(1);

        list.head.next = new Node(2);
        list.head.next.prev = list.head;

        list.head.next.next = new Node(3);
        list.head.next.next.prev = list.head.next;
        list.head.next.next.child = new Node(6);

        list.head.next.next.child.next = new Node(7);
        list.head.next.next.child.next.prev = list.head.next.next.child ;
        list.head.next.next.child.next.child = new Node(9);

        list.head.next.next.child.next.child.next = new Node(10);
        list.head.next.next.child.next.child.next.prev = list.head.next.next.child.next.child;

        list.head.next.next.child.next.next = new Node(8);
        list.head.next.next.child.next.next.prev = list.head.next.next.child.next ;

        list.head.next.next.next = new Node(4);
        list.head.next.next.next.prev = list.head.next.next;

        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.prev = list.head.next.next.next;

        Node res = list.flattenLL(list.head);
        list.head = res;

        list.printList();

    }
}