
//print your name N time using recursion 

public class Ntimes {
    public static void main(String[] args) {

        printNtimes(4);
        printNtimes1(4, 1);
    }

    public static void printNtimes(int n) {
        // base case
        if (n <= 0) {
            return;
        }
        System.out.println("gfg");

        printNtimes(--n);
    }

    /*
     * Can you
     * print the
     * name N
     * times using
     * recursion without
     * decreasing n, but
     * instead by
     * increasing another
     * variable from 1
     * to N?
     */
    public static void printNtimes1(int n, int var) {
        if (var > n) {
            return;
        }
        System.out.println("--gfg--");
        printNtimes1(n, ++var);
    }
}
