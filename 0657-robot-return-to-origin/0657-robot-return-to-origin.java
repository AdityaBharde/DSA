class Solution {
    public boolean judgeCircle(String moves) {
        int ver = 0;
        int hori = 0;

        for (char a : moves.toCharArray()) {
            if (a == 'R') {
                hori++;
            } else if (a == 'L') {
                hori--;
            } else if (a == 'U') {
                ver++;
            } else if (a == 'D') {
                ver--;
            }
        }

        return ver == 0 && hori == 0;
    }
}
