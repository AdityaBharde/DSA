class Solution {
    static List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        res.clear();
        for (int i = 0; i < n; i++) {
            List<String> a = new ArrayList<>();
            a.add(createString(i, n));
            nQueen(a, 1, n);
        }
        return res;
    }

    public void nQueen(List<String> a, int r, int n) {
        if (r == n) {
            res.add(new ArrayList<>(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (safe(a, r, i)) {
                a.add(createString(i, n));
                nQueen(a, r + 1, n);
                a.removeLast();
            }
        }
    }

    public boolean safe(List<String> a, int r, int c) {
        for (int i = 0; i < r; i++) {
            String curr = a.get(i);
            for (int j = 0; j < curr.length(); j++) {
                if (curr.charAt(j) == 'Q' && (Math.abs(r - i) == Math.abs(c - j) || j == c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String createString(int c, int n) {
        return ".".repeat(c) + "Q" + ".".repeat(n - c - 1);
    }
}