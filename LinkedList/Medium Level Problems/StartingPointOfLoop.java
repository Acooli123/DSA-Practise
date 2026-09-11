class StartingPointOfLoop {
    Node head;

    static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node startingPointOfLoop() {
        if (head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
        int size;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                Node current = slow.next;
                size = 1;

                while(current != slow){
                    size++;
                    current = current.next;
                }

                System.out.println("Size of the loop is : "+size);
                return slow;
            }
        }


        return null; // no loop
    }

    public static void main(String[] args) {
        StartingPointOfLoop list = new StartingPointOfLoop();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        // loop checking condition
        list.head.next.next.next.next = list.head.next;    // here loop is present

        Node res = list.startingPointOfLoop();

        System.out.println("Starting point of the loop is : " + res.data);

    }
}