
import java.util.Scanner;

class PascalTriangle {

    public static int findPascalElement(int r, int c){
        int n = r-1;
        int k = c-1;
        int res = 1;
        for(int i=0; i<k; i++){
            res = res * (n-i);
            res = res / (i+1);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int c = sc.nextInt();

        System.out.println("The element is : " +findPascalElement(r, c));
    }
}