import java.util.*;

class UnionArrays {

    public static void unionArrays(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<m; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<n; i++){
            set.add(arr2[i]);
        }

        System.err.println("Union of two arrays : ");
        System.err.println(set);
        System.err.print("Size of set is : "+ set.size());
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,10,4,5};
        int arr2[] = {1,2,7,6,8};
        unionArrays(arr1, arr2);
    }
}