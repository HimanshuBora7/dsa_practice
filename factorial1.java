//print factorial of a number using functional recursion

public class factorial1 {

    public static void main(String[] args) {
        System.out.println("factorial of 5 is " + factorial(5));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}