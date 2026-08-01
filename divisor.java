
//print all divisor of a number 
import java.util.ArrayList;

public class divisor {
    public static void main(String[] args) {

        int n = 25;
        ArrayList<Integer> result = checkDivisor(n);
        System.out.println(result);
        ArrayList<Integer> result1 = optimisedApproach(n);
        System.out.println("result from optimised approach" + result1);
    }

    public static ArrayList<Integer> checkDivisor(int n) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                result.add(i);
            }
        }
        return result;
        // time complexity O(num);
    }

    // optimised approach for this would be ~ covering factors till root(num) and
    // then checking for factors
    public static ArrayList<Integer> optimisedApproach(int num) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                result.add(i);
                if (num / i != i) {
                    result.add(num / i);
                }
            }
        }
        return result;
        // time complexity O(root(num));

    }

}
