class AddTwoList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node addTwoNumbers(Node l1, Node l2){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;

            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            int val = sum % 10;
            Node newNode = new Node(val);

            temp.next = newNode;
            temp = temp.next;
        }

        return dummy.next;
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
        AddTwoList l1 = new AddTwoList();
        AddTwoList l2 = new AddTwoList();

        l1.head = new Node(2);
        l1.head.next = new Node(4);
        l1.head.next.next = new Node(3);

        l2.head = new Node(5);
        l2.head.next = new Node(6);
        l2.head.next.next = new Node(4);

        l1.printList();
        l2.printList();

        System.out.println("Sum of two lists are : ");

        Node res = l1.addTwoNumbers(l1.head, l2.head);
        l1.head = res;

        l1.printList();
    }
}