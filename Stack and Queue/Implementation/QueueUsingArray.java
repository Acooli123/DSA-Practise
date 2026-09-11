class QueueUsingArray {
    static int front = -1;
    static int rear = -1;

    public static void enqueue(int arr[], int data){
        if(rear == arr.length - 1){
            System.out.println("Queue overflow");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear++;
        arr[rear] = data;
    }

    public static int dequeue(int arr[]){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return -1;
        }

        int data = arr[front];
        front++;

        if(front > rear){
            front = -1;
            rear = -1;
        }

        return data;
    }

    public static int peek(int arr[]){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    public static void printQueue(int arr[]){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }

        for(int i=front; i<=rear; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        // enqueue(arr, 1);
        // enqueue(arr, 2);
        enqueue(arr, 3);
        enqueue(arr, 4);
        enqueue(arr, 5);

        dequeue(arr);
        dequeue(arr);

        enqueue(arr, 7);
        enqueue(arr, 8);

        dequeue(arr);
        dequeue(arr);
        dequeue(arr);
        
        System.out.println("top of the queue is : " + peek(arr));

        printQueue(arr);
    }
}