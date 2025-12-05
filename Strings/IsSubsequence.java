public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        // BruteForce Approach
        // int j = 0;
        // for (int i = 0; i < t.length(); i++) {
        //     if (s.charAt(j) == t.charAt(i)) {
        //         j++;
        //     }
        // }
        // if (j == s.length()) {
        //     System.out.println("These is a subSequence");
        // }else {
        //     System.out.println("These is not a subSequence");
        // }

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; 
            }
            j++;
        }

        if (i == s.length()) {
            System.out.println("These is a subSequence");
        }else {
            System.out.println("These is not a subSequence");
        }
    }
}
