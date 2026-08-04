// Problem 1

// Print numbers from 1 to N using backtracking.

public class printrevNum1 {
    public static void main(String[] args) {
        printnum(5);
        System.out.println("Printing from N to 1");
        printNto1(5, 1);
    }

    // print 1 to n using backtracking
    public static void printnum(int n) {
        if (n != 1) {
            printnum(n - 1);
        }
        System.out.println(n);

    }

    // print n to 1 using backtracking

    public static void printNto1(int n, int i) {

        if (i > n) {
            return;
        }
        printNto1(n, i + 1);
        System.out.print(i + " ");
    }
}
