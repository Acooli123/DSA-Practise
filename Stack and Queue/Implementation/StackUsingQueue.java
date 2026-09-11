import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public void push(int data){
        q2.add(data);

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        // swap q1 & q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop(){
        return q1.remove();
    }

    public int top(){
        return q1.peek();
    }

    public void printStack(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return;
        }

        System.out.println(q1);
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();

        stack.push(7);
        stack.push(8);

        System.out.println("top of the stack is : " + stack.top());

        stack.printStack();
    }
}