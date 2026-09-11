class IntroOfSinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        Node newNode = new Node(arr[2]);
        System.out.println(newNode.data);
    }
}