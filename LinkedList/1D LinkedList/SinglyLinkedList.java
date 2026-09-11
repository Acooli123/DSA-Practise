class SinglyLinkedList {
    Node head;
    int size;

    public SinglyLinkedList() {
        size = 0;
    }

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void deleteAtHead(){
        if(head == null || head.next == null)   return;

        head = head.next;
        size--;
    }

    public void searchNode(int data){
        Node current = head;
        int index = 0;

        while(current != null){
            current = current.next;
            index++;
            if(current.data == data){
                System.out.println("data is found at index " +index);
                return;
            }
        }
    }

    public void printList(){
        Node current = head;

        while(current != null){
            System.out.print(current.data +"-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtFront(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(1);

        list.deleteAtHead();

        list.printList();

        System.out.println("Size of the list is : " + list.size);

        list.searchNode(4);
    }
}