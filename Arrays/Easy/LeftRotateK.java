import java.util.*;

class LeftRotateK {

    public static void leftRotate_k_places(int arr[], int k){   // k=4
        int n = arr.length;
        if(n == 0)  return;
        k = k % n;

        int temp[] = new int[k];

        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        for(int i=k; i<n; i++){
            arr[i - k] = arr[i];
        }

        int j = 0;
        for(int i=n-k; i<n; i++){
            arr[i] = temp[j];
            j++;
        }

        System.err.println("After left rotation of k-th element : ");
        for(int i=0; i<n; i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.err.print("Enter no. of places you want to move from left: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        leftRotate_k_places(arr,k);
    }
}