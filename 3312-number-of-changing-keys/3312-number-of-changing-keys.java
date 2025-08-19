class Solution {
    public int countKeyChanges(String s) {
        int changes = 0;
        for (int i = 1; i < s.length(); i++) {
            char prev = Character.toLowerCase(s.charAt(i - 1));
            char curr = Character.toLowerCase(s.charAt(i));
            if (prev != curr) {
                changes++;
            }
        }
        return changes;
    }
}