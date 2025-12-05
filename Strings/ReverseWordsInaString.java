public class ReverseWordsInaString {
    public static void main(String[] args) {
        String str = "the sky is blue";

        String[] words = str.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder(); 
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println(reversed);
    }
}
