import java.util.Stack;

class QueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void add(int data){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }

    public static int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        return s1.pop();
    }

    public static int peek(){
         if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return s1.peek();
    }

    public static void printQueue(){
        System.out.println(s1);
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();

        q.add(1);
        q.add(2);
        q.add(3);

        q.remove();

        System.out.println("top of the queue is : " + q.peek());
        
        q.printQueue();
    }
}