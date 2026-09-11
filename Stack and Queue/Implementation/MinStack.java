import java.util.Stack;

class MinStack {
    public Stack<Integer> stack = new Stack<>();
    public Stack<Integer> minStack = new Stack<>();

    public void push(int data){
        stack.push(data);

        if(minStack.isEmpty()){
            minStack.push(data);
        }else{
            minStack.push(Math.min(data, minStack.peek()));
        }
    }

    public void pop(){
        stack.pop();
        minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(1);
        stack.push(2);
        stack.push(-5);
        stack.push(4);
        stack.push(5);

        System.out.println("minimum element of the stack is : " + stack.getMin());
    }
}