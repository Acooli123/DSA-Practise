import java.util.Stack;

class PrefixToPostfix {
    public static void prefixToPostfix(String s){
        Stack<String> st = new Stack<>();

        for(int i=s.length() - 1; i>=0; i--){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else{
                String top1 = st.pop();
                String top2 = st.pop();

                String ans = "(" + top1 + top2 + ch + ")";
                st.push(ans);
            }
        }

        System.out.println("Postfix expressions of the string is : " + st.peek());
    }
    public static void main(String[] args) {
        String str = "+*ab/cd";

        prefixToPostfix(str);
    }
}