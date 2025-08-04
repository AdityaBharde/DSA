class Solution {
    public int compress(char[] chars) {
        int write = 0;

        for (int read = 0; read < chars.length; ) {
            char currentChar = chars[read];
            int count = 0;
            for (int j = read; j < chars.length && chars[j] == currentChar; j++) {
                count++;
            }
            chars[write++] = currentChar;
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
            read += count;
        }

        return write;
    }
}
