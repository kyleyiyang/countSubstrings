class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        boolean[][] dp=new boolean[s.length()][s.length()];
        for (int end=0;end<s.length();end++) {
            for (int start=0;start<=end;start++) {
                if (s.charAt(start)==s.charAt(end) && (end-start<=2 || dp[start+1][end-1])) {
                    dp[start][end]=true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
