import java.util.*;

public class SpyAgency {

    public static String reverseMessage(String msg) {
        return new StringBuilder(msg).reverse().toString();
    }

    public static boolean isPalindrome(String msg) {
        String cleaned = msg.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
 
    public static void countVowelsConsonants(String msg) {
        int vowels = 0, consonants = 0;

        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }

    public static Character firstNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        String secret = "Radar";
        String intercept1 = "listen";
        String intercept2 = "silent";
        String log = "surveillance";

        System.out.println("Original Message: " + secret);
        System.out.println("Reversed Message: " + reverseMessage(secret));

        System.out.println("Palindrome: " + isPalindrome(secret));

        countVowelsConsonants(secret);

        System.out.println("Anagrams: " +
                areAnagrams(intercept1, intercept2));

        System.out.println("First Non-Repeating Character: " +
                firstNonRepeating(log));
    }
}