
//print all divisor of a number 
import java.util.ArrayList;

public class divisor {
    public static void main(String[] args) {

        int n = 25;
        ArrayList<Integer> result = checkDivisor(n);
        System.out.println(result);
    }

    public static ArrayList<Integer> checkDivisor(int n) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
