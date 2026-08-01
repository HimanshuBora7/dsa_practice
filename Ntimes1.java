//Print numbers from 1 to N
//Given an integer N, print the numbers from 1 to N using recursion.
public class Ntimes1 {

    public static void main(String[] args) {
        print(10, 1);
    }

    public static void print(int n, int count) {
        if (count > n) {
            return;
        }
        System.out.println(count);
        print(n, ++count);
    }
}
