class Solution {
    public int numDecodings(String str) {
        char[] chs = str.toCharArray();
        int[] ways = new int[chs.length + 1];
        ways[0] = 1;
        ways[1] = (chs[0] == '0') ? 0 : 1;
        for (int i = 2; i <= chs.length; i++) {
            if (chs[i - 2] == '1' || (chs[i - 2] == '2' && chs[i - 1] < '7')) {
                if (chs[i - 1] == '0') {
                    ways[i] = ways[i - 2];
                } else {
                    ways[i] = ways[i - 2] + ways[i - 1];
                }
            } else {
                if (chs[i - 1] != '0') {
                    ways[i] = ways[i - 1];
                } else {
                    return 0;
                }
            }
        }
        return ways[chs.length];
    }
}