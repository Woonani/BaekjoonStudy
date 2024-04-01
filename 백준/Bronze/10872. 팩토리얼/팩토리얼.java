import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Integer.parseInt(br.readLine());
        long answer= 1;
        if(n!=0){
            for(long i = 1; i<=n; i++){
                answer *= i;
            }
        }
        bw.write(answer+"");
        bw.flush();
        bw.close();
        
    }
}