import java.util.HashMap;

class LongestSubArrayLength {

    public static int maxLength(int arr[]){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum == 0){
                max = max + i;
            }else{
                if(map.containsKey(sum)){
                    max = Math.max(max, i - map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};

        System.out.print("Length of the longest sub-array is : " +maxLength(arr));
    }
}