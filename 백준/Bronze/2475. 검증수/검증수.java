import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long answer = 0;
        for(int i = 0; i<5; i++) {
        	long num = Integer.parseInt(st.nextToken());
        	answer += num*num;  
        }
        
        bw.write(answer%10 +"\n");     		
        bw.flush();
        bw.close();
    }
    
}