import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){
        //  int t;
         
        // t = sc.nextInt();
        // while(t-- > 0){
            Scanner sc = new Scanner(System.in);
            int n,k;
            n = sc.nextInt();
            k = sc.nextInt();
            System.out.println(nextRound(n,k,sc));
       // }
    }

    public static int nextRound(int n, int k, Scanner sc){
        int kthScore = 0, count = 0;
        for(int i=1;i<=n;i++){
            int currScore = sc.nextInt();
            if(i==k){
                kthScore = currScore;
            }
            
            if(currScore > 0 && currScore >= kthScore){
                count++;
            }
        }
        return count;
    }

}
