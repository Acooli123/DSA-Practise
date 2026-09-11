class MaxDepthOfParenthesis {

    public static int maxDepth(String s){
        int count = 0;
        int max = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
                max = Math.max(count,max);
            }else if(ch == ')'){
                count--;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        String str = "(1 + (2*3) + ((8) - 2) / 5)";

        System.out.println("Maximum depth of the parenthesis in this string is : " + maxDepth(str));
    }
}