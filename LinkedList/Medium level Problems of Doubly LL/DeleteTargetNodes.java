class DeleteTargetNodes {
    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public Node deleteTargetNodes(Node head, int target){
        Node current = head;

        while(current != null){
            if(current.data == target){
                if(current.prev != null){
                    current.prev.next = current.next;
                }else{
                    head = current.next;
                }

                if(current.next != null){
                    current.next.prev = current.prev;
                }
            }

            current = current.next;
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
        DeleteTargetNodes list = new DeleteTargetNodes();

        list.head = new Node(5);

        list.head.next = new Node(1);
        list.head.next.prev = list.head;

        list.head.next.next = new Node(10);
        list.head.next.next.prev = list.head.next;

        list.head.next.next.next = new Node(50);
        list.head.next.next.next.prev = list.head.next.next;

        list.head.next.next.next.next = new Node(20);
        list.head.next.next.next.next.prev = list.head.next.next.next;

        Node res = list.deleteTargetNodes(list.head, 5);
        list.head = res;

        list.printList();
    }
}