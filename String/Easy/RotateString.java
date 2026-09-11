class RotateString {

    public static boolean isRotate(String s, String goal){
        if(s.length() != goal.length()) return false;

        int n = s.length();

        for(int i=0; i<n; i++){
            String rotated = s.substring(i) + s.substring(0, i);

            if(rotated.equals(goal))    return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "rotation";
        String goal = "tionrote";

        System.out.print("Is rotation possible  : " + isRotate(str, goal));
    }
}