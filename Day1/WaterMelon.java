import java.util.Scanner;

public class WaterMelon {
    public static void main(String args[]) {
        // int t;
        Scanner sc = new Scanner(System.in);
        // t = sc.nextInt();
        // while(t-- > 0){
        int w;
        w = sc.nextInt();
        System.out.print(IsPossible(w));
        // }
    }

    public static String IsPossible(int w) {
        if (w % 2 == 0 && w > 2)
            return "YES";
        else
            return "NO";
    }
}