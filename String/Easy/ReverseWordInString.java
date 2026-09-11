import java.util.ArrayList;
import java.util.Collections;

class ReverseWordInString {

    public static String reverseString(String s){
        ArrayList<String> word = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }else if (sb.length() > 0) {
                word.add(sb.toString());
                sb.setLength(0);
            }
        }

        if(sb.length() > 0){
            word.add(sb.toString());
            sb.setLength(0);
        }

        Collections.reverse(word);

        return String.join(" ", word);
    }
    public static void main(String[] args){
        String str = "My name is Acooli";
        System.out.println("Reverse of the string is : ");
        System.out.println(reverseString(str));
    }
}