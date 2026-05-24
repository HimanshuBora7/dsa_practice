//print name n times using recursion 

public class recur1 {
    public static void main(String[] args) {
        print_name(5);
    }

    public static void print_name(int n) {
        if (n > 1) { // base condition
            print_name(n - 1);
        }
        System.out.println("Hello " + n);
    }
}
