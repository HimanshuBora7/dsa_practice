
//three sum problem : Find unique triplet whose sum results in 0
import java.util.*;

public class three_sum {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };

        // List<List<Integer>> output = brute_force(arr);

        // List<List<Integer>> output = better_approach(arr);

        List<List<Integer>> output = optimal_approach(arr);

        System.out.println("Output : ");
        for (List<Integer> it : output) {
            System.out.print("[ ");
            for (int x : it) {
                System.out.print(x + " ");
            }
            System.out.print("] ");
        }
    }

    public static List<List<Integer>> brute_force(int[] arr) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    List<Integer> temp = new ArrayList<>();

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        result.add(temp);
                    }

                }
            }
        }
        return result;
    }

    public static List<List<Integer>> better_approach(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (hashSet.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);

                }
                hashSet.add(arr[j]);
            }
        }
        List<List<Integer>> output = new ArrayList<>(st);
        return output;
    }

    public static List<List<Integer>> optimal_approach(int[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int k = n - 1;
            int j = i + 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);

                    result.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }
}
