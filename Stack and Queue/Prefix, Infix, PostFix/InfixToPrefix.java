
import java.util.Stack;

class InfixToPrefix {

    public static int priority(char ch){
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/')  return 2;
        if(ch == '+' || ch == '-')  return 1;

        return -1;
    }

    public static String reverse(String s){
        String reverse = "";

        for(int i=s.length() - 1; i>=0; i--){
            char ch = s.charAt(i);

            // Swap brackets after reversing
            if (ch == '(') reverse += ')';
            else if (ch == ')') reverse += '(';
            else reverse += ch;
        }

        return reverse;
    }

    public static void infixToPrefix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        s = reverse(s);

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isWhitespace(ch))  continue;

            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }

            else if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }

                st.pop();
            }else {
                while (!st.isEmpty() &&
                    (priority(ch) < priority(st.peek()) ||
                    (priority(ch) == priority(st.peek()) && ch == '^'))) {
                    ans.append(st.pop());
                }

                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        System.out.println("prefix expression of the string is : " + ans.reverse());
    }
    public static void main(String[] args) {
        String str = "a + b * (c^d - e) ^ (f + g * h) - i";

        infixToPrefix(str);
    }
}