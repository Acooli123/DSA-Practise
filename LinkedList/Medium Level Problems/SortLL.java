class SortLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void sort(){
        if(head == null || head.next == null)   return;

        boolean swapped = true;        

        while(swapped){
            swapped = false;
            Node current = head;

            while(current.next != null){
                if(current.data > current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }

                current = current.next;
            }
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
        SortLL list = new SortLL();

        list.head = new Node(5);
        list.head.next = new Node(1);
        list.head.next.next = new Node(10);
        list.head.next.next.next = new Node(50);
        list.head.next.next.next.next = new Node(20);

        list.sort();

        list.printList();
    }
}