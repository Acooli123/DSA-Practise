class StringToInteger {

    public static int stringToInt(String s){
        int res = 0;
        char sign = '+';

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                sign = s.charAt(i);
            }
            if(Character.isDigit(s.charAt(i))){
                res = res * 10 + (s.charAt(i) - '0');
            }

        }

        if(sign == '-'){
            return -res;
        }

        return res;
    }
    public static void main(String[] args) {
        String str = "-1234";
        System.out.println("After converting string to integer is : " + stringToInt(str));
    }
}