import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a= Integer.parseInt(st.nextToken());
        long b= Integer.parseInt(st.nextToken());
        
        Main main= new Main();
        
        bw.write(main.calc(a,b)+"\n");     		
        bw.flush();
        bw.close();
    }
    
    public long calc(long a, long b) {
    	return (a+b)*(a-b);
    }
}