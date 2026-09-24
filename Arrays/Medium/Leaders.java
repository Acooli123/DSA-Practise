import java.util.ArrayList;

class Leaders {

    public static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean isLeader = true;
            for(int j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    isLeader = false;
                    break;
                }
            }

            if(isLeader){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> result = leaders(arr);
        System.out.print("Leaders of the array is : "+result);
    }
}