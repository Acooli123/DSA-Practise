import java.util.Stack;

class InfixToPostfix {
    public static int priority(char ch){
        if(ch == '^')   return 3;
        if (ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-')    return 1;

        return -1;
    }

    public static void infixToPostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (Character.isWhitespace(ch)) {
                continue;
            }

            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            } else if(ch == '(') {
                st.push(ch);
            } else if(ch == ')') {
                while(st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            } else {
                while(!st.isEmpty() && priority(ch) <= priority(st.peek())){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        System.out.println("postfix expression of the string is : " + ans);
    }

    public static void main(String[] args) {
        String str = "a + b * (c^d - e) ^ (f + g * h) - i";        

        infixToPostfix(str);        
    }
}