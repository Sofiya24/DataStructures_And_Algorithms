public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder cleaned = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right = cleaned.length()-1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                System.out.println("It is not an palindrome");
            }
            left++;
            right--;
        }
        System.out.println("It is a palindrome");
    }
}
