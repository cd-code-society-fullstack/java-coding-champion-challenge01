import java.util.HashMap;
import java.util.Map;

public class Problem03 {



    public static boolean areSentencesAnagrams(String s, String t) {
        // Normalize the sentences
        s = s.replaceAll("[\\W_]", "").toLowerCase();
        t = t.replaceAll("[\\W_]", "").toLowerCase();
        // Check length after removing punctuation and spaces
        if (s.length() != t.length()) return false;

        // Create frequency counters
        Map<Character, Integer> counterS = new HashMap<>();
        Map<Character, Integer> counterT = new HashMap<>();

        // Fill in the counters
        for (int i = 0; i < s.length(); i++) {
            char letterS = s.charAt(i);
            char letterT = t.charAt(i);
            // Increment letter counters
            counterS.put(letterS, counterS.getOrDefault(letterS, 0) + 1);
            counterT.put(letterT, counterT.getOrDefault(letterT, 0) + 1);
        }

        // Compare the frequency counters
        for (char key : counterS.keySet()) {
            if (!counterS.get(key).equals(counterT.get(key))) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String input1 = args[0];
        String input2 = args[1];

        System.out.println(areSentencesAnagrams(input1, input2));
    }
}
