import java.util.Stack;

class NextGreaterElement2 {

    public static void nextGreaterElement(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];

        for(int i = 2*n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i % n]){
                st.pop();
            }

            if(i < n){
                if(!st.isEmpty()){
                    res[i] = st.peek();
                }else{
                    res[i] = -1;
                }
            }

            st.push(arr[i % n]);
        }

        System.err.println("Next Greater element in circular array : ");
        for(int i=0; i<n; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};

        nextGreaterElement(arr);
    }
}