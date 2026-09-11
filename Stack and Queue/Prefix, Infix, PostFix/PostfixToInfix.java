import java.util.Stack;

class PostfixToInfix {
    public static void postfixToInfix(String s){
        Stack<String> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else{
                String top1 = st.pop();
                String top2 = st.pop();

                String infix = '(' + top2 + ch + top1 + ')';
                st.push(infix);
            }
        }

        System.out.println("Infix expressions of the string is : " + st.peek());
    }

    public static void main(String[] args) {
        String str = "ab*cd/+";

        postfixToInfix(str);
    }
}