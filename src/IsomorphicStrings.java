import java.util.HashMap;

public class IsomorphicStrings {

    /** 
    * Given two strings s and t, determine if they are isomorphic.
    * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
     */

    public static void main(String[] args) {
        String s = "add";
        String t = "egg";

        boolean response = isIsomorphic(s, t);
        System.out.println(response);
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> letters = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            char sLetter = s.charAt(i);
            char tLetter = t.charAt(i);

            if (letters.containsKey(sLetter)) {
                char tMapped = letters.get(sLetter);
                if (tMapped != tLetter) return false;
            } else if (letters.containsValue(tLetter)) {
                return false;
            }

            letters.put(sLetter, tLetter);
        }

        return true;
    }
}