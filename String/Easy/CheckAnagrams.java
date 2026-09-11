import java.util.*;

class CheckAnagrams {

    public static boolean checkAnagrams(String s1, String s2){
        if(s1.length() != s2.length())  return false;

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for(int i=0; i<s1.length(); i++){
            if(charArray1[i] != charArray2[i])  return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ACD";

        System.out.println("Are these strings anagrams : " + checkAnagrams(str1, str2));
    }
}   
