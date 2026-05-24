//Print sum of n natural number using parameterized and funcitonal recursion 

public class recur2 {
    public static void main(String[] args) {
        p_sum(4, 0);
        System.out.println("Sum using functional recursion " + f_sum(4));
    }

    // parameterized recursion function
    public static void p_sum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        p_sum(n - 1, sum + n);
    }

    // functional recursion function
    public static int f_sum(int n) {
        if (n == 0) {

            return 0;
        }
        return n + f_sum(n - 1);

    }
}
