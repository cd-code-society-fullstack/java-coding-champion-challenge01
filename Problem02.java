public class Problem02 {

    public static int longestWordLength(String s) {
        int longestWordLength = 0;
        String[] words = s.split("\\s+");
        for (String word : words) {
            longestWordLength = Math.max(longestWordLength, word.length());
        }
        return longestWordLength;
    }

    public static void main(String[] args) {
        String input1 = args[0];
        System.out.println(longestWordLength(input1));
    }

}
