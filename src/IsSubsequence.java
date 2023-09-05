public class IsSubsequence {
    public static void main(String[] args) {
    }

    private static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int total = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;

                total++;
            } else {
                j++;
            }
        }

        if (total == s.length()) return true;

        return false;
    }
}
