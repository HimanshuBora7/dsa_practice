public class revArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println("original array");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("--------");
        revArr1(arr, 0, arr.length - 1);
        System.out.println("Reversed array ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void revArr1(int[] arr, int l, int r) {
        if (l > r) {
            return;
        } else {
            int z = arr[r];
            arr[r] = arr[l];
            arr[l] = z;

            revArr1(arr, l + 1, r - 1);
        }
    }
}
