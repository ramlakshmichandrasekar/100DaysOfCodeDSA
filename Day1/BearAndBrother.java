import java.math.BigInteger;
import java.util.Scanner;

public class BearAndBrother {
    public static void main(String args[]) {
        // int t;
        Scanner sc = new Scanner(System.in);
        // t = sc.nextInt();
        // while(t-- > 0){
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(bearBrothers(a, b));
        // }
    }

    public static int bearBrothers(int a, int b) {
        int count = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            count++;
        }
        return count;
    }

}