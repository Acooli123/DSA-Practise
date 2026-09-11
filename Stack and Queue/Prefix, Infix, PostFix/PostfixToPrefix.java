import java.util.Stack;

class PostfixToPrefix {
    public static void postfixToPrefix(String s){
        Stack<String> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else {
                String top1 = st.pop();
                String top2 = st.pop();

                String ans = "(" + ch + top2 + top1 + ")";
                st.push(ans);
            }
        }

        System.out.println("Prefix expressions of the string is : " + st.peek());
    }
    public static void main(String[] args) {
        String str = "AB-DE+F*/";

        postfixToPrefix(str);
    }
}