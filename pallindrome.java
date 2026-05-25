// check for pallindrome 
// taking string as input use Scanner class

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean frwd = true;

        while (frwd) {

            System.out.println("Enter the word to check if is a pallinddrome or not ");
            String word1 = sc.next();
            System.out.println("the word taken " + word1);
            checkPallin(word1);
            System.out.println("Want to continure ? enter no to exit");
            String word2 = sc.next();
            if (word2.equalsIgnoreCase("no")) {
                frwd = false;
            }
        }
        sc.close();
    }

    public static void checkPallin(String w) {
        String cleanW = w.toLowerCase();

        int i = 0;
        int counter = 0;
        int n = cleanW.length() - 1;
        while (i < (cleanW.length()) / 2) {

            if (cleanW.charAt(i) != cleanW.charAt(n - i)) {
                System.out.println("not a pallindrome");
                counter++;
                break;
            }
            i++;
        }
        if (counter == 0) {
            System.out.println("It is a pallindrome ");
        }
    }

}
