import java.util.*;

class Solution {
    public int solution(int[][] signals) {
        Set<Long> candidates = new HashSet<>();
        candidates.add(0L);

        long mod = 1;

        for (int[] signal : signals) {
            int g = signal[0];
            int y = signal[1];
            int r = signal[2];

            int period = g + y + r;

            Set<Long> next = new HashSet<>();

            for (long current : candidates) {
                for (int yellow = g + 1; yellow <= g + y; yellow++) {
                    long merged = merge(current, mod, yellow, period);

                    if (merged != -1) {
                        next.add(merged);
                    }
                }
            }

            if (next.isEmpty()) {
                return -1;
            }

            candidates = next;
            mod = lcm(mod, period);
        }

        long answer = Long.MAX_VALUE;

        for (long time : candidates) {
            if (time == 0) {
                time = mod;
            }
            answer = Math.min(answer, time);
        }

        return (int) answer;
    }

    private long merge(long a, long m, long b, long n) {
        long g = gcd(m, n);

        if ((b - a) % g != 0) {
            return -1;
        }

        long newMod = lcm(m, n);

        for (long k = 0; k < n / g; k++) {
            long x = a + m * k;

            if ((x - b) % n == 0) {
                return ((x % newMod) + newMod) % newMod;
            }
        }

        return -1;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}