import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = in.nextLine();
        if (new StringReverse().findReverseString(str) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    /**
     * Find if string is Palindrome or not
     * @param str
     * @return boolean
     */


    public boolean findReverseString(String str) {
        int start = 0;
        int end = str.length() - 1;
        boolean flag = true;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;
    }
}
