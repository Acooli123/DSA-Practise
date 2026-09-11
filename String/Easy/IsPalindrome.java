class IsPalindrome {

    public static Boolean isPalindrome(String s){
        String reverse = "";
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            reverse += ch;
        }

        System.out.println(reverse);

        if(s.equals(reverse)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "ABCBA";
        System.out.println("Reverse of the string is : ");
        // isPalindrome(str);
        System.out.println(isPalindrome(str));
    }
}