class Solution {
    public int[] sumAndMultiply(String s, int[][] q) {
        int m = s.length();
        int n = q.length;
        long MOD = 1000000007L;

        // 1. Allocate primitive structures
        long[] prefixX = new long[m + 1];
        long[] prefixSum = new long[m + 1];
        long[] power10 = new long[m + 1];
        int[] cnt = new int[m + 1];

        power10[0] = 1;

        // 2. Linear single scan of the 46k character string
        for (int i = 0; i < m; i++) {
            power10[i + 1] = (power10[i] * 10) % MOD;
            int digit = s.charAt(i) - '0';
            
            if (digit != 0) {
                prefixX[i + 1] = (prefixX[i] * 10 + digit) % MOD;
                prefixSum[i + 1] = prefixSum[i] + digit;
                cnt[i + 1] = cnt[i] + 1;
            } else {
                prefixX[i + 1] = prefixX[i];
                prefixSum[i + 1] = prefixSum[i];
                cnt[i + 1] = cnt[i];
            }
        }

        // 3. Process the massive query arrays instantly
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int L = q[i][0];
            int R = q[i][1];

            int nonZeroCount = cnt[R + 1] - cnt[L];
            
            // Fast inline prefix subtraction logic
            long x = prefixX[R + 1] - (prefixX[L] * power10[nonZeroCount]) % MOD;
            if (x < 0) x += MOD;
            
            long sum = (prefixSum[R + 1] - prefixSum[L]) % MOD;

            arr[i] = (int) ((x * sum) % MOD);
        }
        
        return arr;
    }
}
