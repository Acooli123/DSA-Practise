class QueueUsingLL {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        if (head.next == null) {
            int data = head.data;
            head = null;
            return data;
        }

        Node current = head;
        Node ptr = head.next;

        while(ptr.next != null){
            current = current.next;
            ptr = ptr.next;
        }

        current.next = ptr.next;
        return ptr.data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        return current.data;
    }

    public void printQueue(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.remove();

        System.out.println("top of the queue is : " + q.peek());

        q.printQueue();
    }
}