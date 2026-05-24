public class sum {
    public static void main(String[] args) {
        int sum = sumRecur(5, 0);
        System.out.println(sum);
    }

    public static int sumRecur(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        sum += n;
        return sumRecur(n - 1, sum);
    }
}
