public class rough1 {
    public static void main(String[] args) {
        split_num(3434);
        System.out.println("Reverse of the number is " + rev_num(123));

        // armstrong number problem
        System.out.println("checking for armstrong number " + checkArmstrongNum(153));
    }
    // splitting the number

    public static void split_num(int n) {
        System.out.println("orginal number " + n);
        while (n > 0) {
            System.out.println("Last digit of the number " + n % 10);
            n = n / 10;
            System.out.println("Remaining number " + n);

        }
    }
    // reverse a number

    // the concept is simple extracts the digits from last and append them but
    // before multiply it by 10 to make space for adding new digit

    public static int rev_num(int n) {
        int revNumber = 0;

        while (n > 0) {
            revNumber = (revNumber * 10 + (n % 10));
            n = n / 10;
        }
        return revNumber;
    }
    // Armstrong number ~ also known as narcissit number, is a number that is a sum
    // of its own digit raised to the power of the number of digits

    public static boolean checkArmstrongNum(int n) {
        // first we find the number of digits in the number

        int digitCount = 0;
        int originalNum = n;
        int n1 = n;
        while (n1 > 0) {
            n1 = n1 / 10;
            digitCount++;
        }
        System.out.println("digit count " + digitCount);

        int armSum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.println("last digit is " + lastDigit);
            armSum += doPow(lastDigit, digitCount);
            System.out.println(armSum);
            n = n / 10;
        }

        if (armSum == originalNum) {

            return true;
        } else {
            return false;
        }
    }

    public static int doPow(int n, int pow) {
        int result = 1;

        for (int i = 0; i < pow; i++) {
            result = result * n;
        }
        System.out.println("power" + result);
        return result;
    }
}
