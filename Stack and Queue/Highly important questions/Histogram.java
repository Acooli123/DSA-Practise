
import java.util.Stack;

class Histogram {

    public static int largestRectangleInHistogram(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int right[] = new int[n];
        int left[] = new int[n];

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(i < n){
                if(!st.isEmpty()){
                    left[i] = st.peek();
                }else{
                    left[i] = -1;
                }
            }

            st.push(i);
        }

        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(i < n){
                if(!st.isEmpty()){
                    right[i] = st.peek();
                }else{
                    right[i] = n;
                }
            }

            st.push(i);
        }

        int ans = 0;

        for(int i=0; i<n; i++){
            int width = right[i] - left[i] - 1;
            int currArea = arr[i] * width;
            ans = Math.max(currArea, ans);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};

        int res = largestRectangleInHistogram(arr);
        System.out.println("Largest area of the rectangle is : " + res);
    }
}