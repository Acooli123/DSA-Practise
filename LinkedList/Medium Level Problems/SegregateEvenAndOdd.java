class SegregateEvenAndOdd {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node SegregateEvenAndOdd(){
        if(head == null || head.next == null)   return head;

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;

        Node current = head;

        while(current != null){
            if(current.data % 2 == 0){
                
                if(evenHead == null){
                    evenHead = current;
                    evenTail = current;
                }else{
                    evenTail.next = current;
                    evenTail = current;
                }

            }else{
                
                if(oddHead == null){
                    oddHead = current;
                    oddTail = current;
                }else{
                    oddTail.next = current;
                    oddTail = current;
                }
            }

            current = current.next;
        }

        if(evenHead == null)    return oddHead;

        if(oddHead == null)     return evenHead;

        evenTail.next = oddHead;
        oddTail.next = null;

        return evenHead;
    }

    public static void main(String[] args){
        SegregateEvenAndOdd list = new SegregateEvenAndOdd();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);

        Node newHead = list.SegregateEvenAndOdd();

        System.out.println("Segregate even and odd nodes in LinkedList : ");
        
        while(newHead != null){
            System.out.print(newHead.data +"-> ");
            newHead = newHead.next;
        }
        System.out.println("NULL");

    }
}