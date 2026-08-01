// Print numbers from N to 1 using recursion.
public class printRevNum {
    public static void main(String[] args) {
        printNum(5);
    }

    public static void printNum(int num) {
        if (num < 1) {
            return;
        }
        System.out.println(num);
        num--;
        printNum(num);
    }
}
