class AddOneToNumber {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int findCarry(Node ptr){
        if(ptr == null)     return 1;

        int carry = findCarry(ptr.next);
        int sum = ptr.data + carry;
        ptr.data = sum % 10;

        return sum / 10;
    }

    public Node addOne(Node head){
        int carry = findCarry(head);

        if(carry != 0){
            Node newNode = new Node(carry);
            newNode.next = head;
            head = newNode;
        }

        return head;
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
        AddOneToNumber list = new AddOneToNumber();

        list.head = new Node(9);
        list.head.next = new Node(9);
        list.head.next.next = new Node(9);

        Node res = list.addOne(list.head);
        list.head = res;

        list.printList();
    }
}