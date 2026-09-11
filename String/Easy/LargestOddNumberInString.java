class LargestOddNumberInString {

    public static String largestOddNumber(String s){
        int n = s.length();
        int i = n-1;

        while(i >= 0){
            if((s.charAt(i) - '0') % 2 != 0){
                break;
            }
            i--;
        }

        if(i < 0)   return "";

        return s.substring(0, i+1);
    }
    public static void main(String[] args) {
        String str = "78956";
        System.out.println("Largest odd number in the string is : ");
        System.out.println(largestOddNumber(str));
    }
}