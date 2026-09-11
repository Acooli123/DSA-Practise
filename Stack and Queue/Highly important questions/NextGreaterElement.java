import java.util.*;

class NextGreaterElement {

    public static void nextGreaterElement(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(i < n){
                if(!st.isEmpty()){
                    res[i] = st.peek();
                }else{
                    res[i] = -1;
                }
            }

            st.push(arr[i]);
        }

        System.out.println("Next greater element in linear array is : ");
        for(int i=0; i<n; i++){
            System.out.print(res[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};

        nextGreaterElement(arr);

    }
}