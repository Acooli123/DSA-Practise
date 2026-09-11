class RemoveOuterMostParenthesis {

    public static String removeOuterMostParenthesis(String s){
        String result = "";
        String temp = "";
        int count = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.toCharArray()[i];
            temp += ch;

            if(ch == '('){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                result += temp.substring(1, temp.length()-1);
                temp = "";
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println("After removing outermost parenthesis : ");
        System.out.print(removeOuterMostParenthesis(str));
    }
}