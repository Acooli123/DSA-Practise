class StackUsingLL {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data){
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

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        Node top = head;
        head = head.next;
        return top.data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return head.data;
    }

    public void printStack(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();

        System.out.println("top of the stack is : " + stack.peek());

        stack.printStack();
    }
}