class IsPalindrome {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node reverse(Node head){
        if(head == null || head.next == null)   return head;

        Node currNode = head;
        Node prevNode = null;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null)   return true;

        Node slow = head;
        Node fast = head;

        // find middle of the list
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }   // now slow is the middle


        // for odd number of nodes, skip middle
        // if (fast != null) {
        //     slow = slow.next;
        // }

        Node firstHalf = head;
        Node secondHalf = reverse(slow);

        while(secondHalf != null){
            if(firstHalf.data != secondHalf.data)   return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome list = new IsPalindrome();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(1);

        System.out.println("Is list palindrome : " + list.isPalindrome());
    }
}