// euclidian algo is used to find the GCD or HCF of two numbers 

public class euclidian_algo {
    public static void main(String[] args) {
        int a = 115;
        int b = 120;
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else if (b > a) {
                b = b % a;
            }
            if (a == 0) {
                System.out.println(b);
            }
            if (b == 0) {
                System.out.println(a);
            }
        }
    }
}