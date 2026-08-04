public class pallindrome1 {
    public static void main(String[] args) {
        String s = "kayak";
        if (checkPallindrome(s, 0, s.length() - 1))
            System.out.print("it is a palindrome\n");
        else
            System.out.println("Not a pallindrome\n");

    }

    public static boolean checkPallindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        } else if (s.charAt(right) == s.charAt(left)) {
            return checkPallindrome(s, left + 1, right - 1);
        } else {
            return false;
        }

    }
}
