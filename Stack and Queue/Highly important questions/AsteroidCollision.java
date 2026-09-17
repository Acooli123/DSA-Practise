import java.util.*;

class AsteroidCollision {

    public static int[] asteroidCollision(int arr[]){
        int n = arr.length;
        List<Integer> st = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                st.add(arr[i]);
            }else{
                while(!st.isEmpty() && st.get(st.size()-1) > 0 && st.get(st.size()-1) < Math.abs(arr[i])){
                    st.remove(st.get(st.size()-1));
                }

                while(!st.isEmpty() && st.get(st.size()-1) == Math.abs(arr[i])){
                    st.remove(st.get(st.size()-1));
                }

                while(st.isEmpty() || st.get(st.size()-1) < 0){
                    st.add(arr[i]);
                }
            }
        }

        int ans[] = new int[st.size()];
        for(int i=0; i<st.size(); i++){
            ans[i] = st.get(i);
        }

        return ans;
    }
    public static void main(String args[]){
        int arr[] = {10, 20, -10};

        int ans[] = asteroidCollision(arr);
        System.out.println("The states of asteroid after collision is : ");
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}