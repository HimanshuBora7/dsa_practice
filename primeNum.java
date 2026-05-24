public class primeNum {
    public static void main(String[] args) {

    }

    public static boolean checckPrime(int n) {
        // we cover the numbers till root of n and our all the factors will be covered
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
    // another optimized solution for this

    public static boolean checkPrimeOptimized(int n) {
        if (n <= 1)
            return false;

        // start from 2 as 1 divides everything
        // we check till sqrt of n as the factors come in pair

        for (int i = 0; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
