import java.util.Stack;

class PrefixToInfix {
    public static void prefixToInfix(String s){
        Stack<String> st = new Stack<>();

        for(int i=s.length() - 1; i>=0; i--){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else{
                String top1 = st.pop();
                String top2 = st.pop();

                String infix = '(' + top1 + ch + top2 + ')';
                st.push(infix);
            }
        }

        System.out.println("Infix expressions of the string is : " + st.peek());
    }
    public static void main(String[] args) {
        String str = "+*ab/cd";

        prefixToInfix(str);
    }
}