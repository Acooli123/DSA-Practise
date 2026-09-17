import java.util.Stack;

class RemoveKDigits {
    
    public static String smallestRemoveKDigits(String num, int k){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<num.length(); i++){
            char digit = num.charAt(i);

            while(!st.isEmpty() && k>0 && st.peek() > digit){
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while(k > 0){
            st.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()){
            res.append(st.pop());
        }

        res.reverse();
        int index = 0;

        while(index < res.length() && res.charAt(index) == '0'){
            index++;
        }

        if(index == res.length()){
            return "0";
        }

        return res.substring(index);
    }
    public static void main(String[] args) {
        String num = "1002991";
        int k = 3;

        String ans = smallestRemoveKDigits(num, k);

        System.out.println("The smallest possible integer after removing k digits is: " + ans);
    }
}