//print sum of N numbers using parametrized and functional recursion 
// rememeber in parameterised we build our answer as we go down
//but in functional recursion we build our answer coming back here the function returns value

public class sum1 {
    public static void main(String[] args) {
        printsum(5, 0);
        int sum = funcSum(5);
        System.out.println(sum);

    }

    public static void printsum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        printsum(n - 1, sum + n);

    }

    public static int funcSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + funcSum(n - 1);
    }
}
