package String;

import java.util.Arrays;

public class LeetCode821 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int min = n;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    min = Math.min(min, Math.abs(i - j));
                }
            }

            ans[i] = min;
        }

        return ans;
    }

    public static void main(String[] args) {
        LeetCode821 l1=new LeetCode821();
        String s1="loveleetcode";
        char c1='e';
        System.out.println(Arrays.toString(l1.shortestToChar(s1,c1)));

    }
}
