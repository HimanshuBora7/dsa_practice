// reverse an array using recursion

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("b4 reversing");
        for (int x : arr) {
            System.out.print(x + "");
        }

        System.out.println("\n after reversing");
        revArray(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + "");
        }
    }

    public static void revArray(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        revArray(arr, left + 1, right - 1);
    }
}
