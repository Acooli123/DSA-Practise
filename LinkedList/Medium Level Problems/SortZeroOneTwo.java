class SortZeroOneTwo {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void sortZeroOneTwo(){
        if(head == null || head.next == null)   return;

        Node dummyZero = new Node(-1);
        Node dummyOne = new Node(-1);
        Node dummyTwo = new Node(-1);

        Node zero = dummyZero;
        Node one = dummyOne;
        Node two = dummyTwo;

        Node current = head;

        while(current != null){

            if(current.data == 0){
                zero.next = current;
                zero = zero.next;
            }else if(current.data == 1){
                one.next = current;
                one = one.next;
            }else{
                two.next = current;
                two = two.next;
            }

            current = current.next;
        }

        zero.next = (dummyOne.next == null) ? dummyTwo.next : dummyOne.next;
        one.next = dummyTwo.next;
        two.next = null;

        head = dummyZero.next;
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
        SortZeroOneTwo list = new SortZeroOneTwo();

        list.head = new Node(0);
        list.head.next = new Node(1);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(1);
        list.head.next.next.next.next = new Node(0);

        list.sortZeroOneTwo();

        list.printList();
    }
}