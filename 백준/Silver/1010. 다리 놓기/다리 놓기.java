import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<= t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long n = Integer.parseInt(st.nextToken());
        	long m = Integer.parseInt(st.nextToken());
        	
        	long answer = 1;
        	if(n !=m){
	        	long deno = n > (m-n) ? n : (m-n);
	        	long numer = n < (m-n) ? n : (m-n);
	        	
	        	for(long j = m; j>deno; j--) {
	        		answer *= j;
	        	}
	        	for(long j = 1; j <= numer; j++) {
	        		answer /= j;
	        	}
        	}
        	bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();
    }
}

