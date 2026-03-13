package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Soru : "2 den büyük her çift sayı, 2 tane asal sayının toplamı şeklinde yazılabiliyor. Girilen bir çift sayının hangi 2 asal sayının toplamı olduğunu bulan kod."
*/

public class PrimeNumber {
    static int[] arr;
    public static void main(String[] args) {

        getTwoPrimeNumbers(24);
        System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> getPrimeNumbers(int num) {
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static int[] getTwoPrimeNumbers(int num) {
        arr = new int[2];
        List<Integer> primeNumbers = getPrimeNumbers(num);
        int i = 0;
        int j = primeNumbers.size() - 1;
        while (i < j) {
            int temp = primeNumbers.get(i) + primeNumbers.get(j);
            if (temp == num) {
                arr[0] = primeNumbers.get(i);
                arr[1] = primeNumbers.get(j);
                return arr;
            } else if (temp < num) {
                i++;
            } else {
                j--;
            }
        }
        return arr;
    }

    public static List<Integer> getPrimeNumbersDeprecated(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrimeNumber(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i < n; i += 6) {
            if ((n % i == 0) || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
