import java.util.Scanner;

public class TheatreSquare {
    public static void main(String args[]) {
        // int t;
        Scanner sc = new Scanner(System.in);
        // t = sc.nextInt();
        // while(t-- > 0){
        long n, m, a;
        n = sc.nextLong();
        m = sc.nextLong();
        a = sc.nextLong();
        System.out.println(theatreStones(n, m, a));
        // }
    }

    public static long theatreStones(long n, long m, long a) {
        long flagLength = (n + a - 1) / a;
        long flagWidth = (m + a - 1) / a;
        return flagLength * flagWidth;
    }

}