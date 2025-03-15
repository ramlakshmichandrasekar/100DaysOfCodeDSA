import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String args[]) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            System.out.println(abbreviate(s));
        }
    }

    public static String abbreviate(String s) {
        int n = s.length();
        String returnString = "";
        if (n > 10) {
            returnString += s.charAt(0);
            returnString += (n - 2);
            returnString += s.charAt(n - 1);
        } else {
            returnString = s;
        }
        return returnString;
    }
}