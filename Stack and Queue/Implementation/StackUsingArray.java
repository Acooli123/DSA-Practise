class StackUsingArray {

    static int top = -1;

    public static void push(int arr[], int data){
        if(top == arr.length - 1){
            System.out.println("Stack overflow");
            return;
        }

        top++;
        arr[top] = data;
    }

    public static int pop(int arr[]){
        if(top == -1){
            System.err.println("Stack it empty");
            return -1;
        }

        int data = arr[top];
        top--;
        return data;
    }

    public static int peek(int arr[]){
        if(top == -1){
            System.err.println("Stack it empty");
            return -1;
        }

        return arr[top];
    }

    public static void printStack(int arr[]){
        for(int i=top; i >= 0; i--){
            System.out.println(arr[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        push(arr, 1);
        push(arr, 2);
        push(arr, 3);
        push(arr, 4);
        push(arr, 5);

        pop(arr);
        pop(arr);

        push(arr, 7);
        push(arr, 8);
        // push(arr, 9);

        pop(arr);
        pop(arr);
        pop(arr);
        pop(arr);
        pop(arr);

        System.out.println("Top of the element is : " + peek(arr));

        printStack(arr);
    }
}