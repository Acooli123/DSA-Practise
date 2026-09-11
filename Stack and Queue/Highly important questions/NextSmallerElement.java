import java.util.Stack;

class NextSmallerElement {

    public static void nextSmallerElement(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];

        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
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

        System.out.println("Next smaller element in array : ");
        for(int i=0; i<n; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 8, 5, 2, 25};

        nextSmallerElement(arr);
    }
}