class ReverseKGroups {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node reverseKGroup(Node head, int k){
        Node temp = head;
        int count = 0;

        while(count < k){
            if(temp == null)    return head;

            temp = temp.next;
            count++;
        }

        Node prevNode = reverseKGroup(temp, k);

        temp = head;
        count = 0;

        while(count < k){
            Node next = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = next;

            count++;
        }

        return prevNode;
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
        ReverseKGroups list = new ReverseKGroups();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        int k = 2;

        Node res = list.reverseKGroup(list.head, k);
        list.head = res;

        list.printList();
    }
}