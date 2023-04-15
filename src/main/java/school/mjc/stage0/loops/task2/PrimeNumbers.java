package school.mjc.stage0.loops.task2;

import java.util.Arrays;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        boolean[] isPrime = new boolean[printToInclusive+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i*i <= printToInclusive; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= printToInclusive; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= printToInclusive; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
