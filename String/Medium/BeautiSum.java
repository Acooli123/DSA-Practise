import java.util.HashMap;

class BeautiSum {

    public static int beautiSum(String s){
        int n = s.length();
        int sum = 0;

        for(int i=0; i<n; i++){
            HashMap<Character, Integer> freq = new HashMap<>();

            for(int j=i; j<n; j++){
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for(int val : freq.values()){
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }

                sum += max - min;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        String str = "aabcbaa";

        System.out.println("Beauti Sum of the string is : " + beautiSum(str));
    }
}