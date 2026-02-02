public class factorial {
    public static void main(String[] args) {
        func(5, 1);
    }

    public static void func(int n, int sum) {
        if (n == 1) {
            System.out.println(sum);
            return;
        }
        sum *= n;
        func(n - 1, sum);
    }
}
