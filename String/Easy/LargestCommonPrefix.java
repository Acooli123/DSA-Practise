import java.util.*;

class LargestCommonPrefix {

    public static String largestCommonPrefix(String str[]){
        int n = str.length;
        Arrays.sort(str);
        StringBuilder ans = new StringBuilder();
        String first = str[0];
        String last = str[n-1];

        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String str[] = {"flower", "flow", "fly"};
        System.out.println("Largest Common prefix is : ");
        System.out.println(largestCommonPrefix(str));
    }
}