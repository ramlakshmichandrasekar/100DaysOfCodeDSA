import java.io.*;
import java.util.*;

public class FastIO_Template {

    // TODO : need to write the remaining template
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

       
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine()); // splits input line into tokens
            }
            return st.nextToken();
        }

       int nextInt() throws IOException{
            return Integer.parseInt(next());
       }

       long nextLong() throws IOException{
           return Long.parseLong(next());
       }

       double nextDouble() throws IOException{
        return Double.parseDouble(next());
       }

       String nextLine() throws IOException{
        return br.readLine();
       }


    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    
}