import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i<= t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long x = Integer.parseInt(st.nextToken());
        	long y = Integer.parseInt(st.nextToken());
        	
        	long goal = y - x;

        	long k = (long) Math.sqrt(goal);

            if(goal == k*k) {
        		bw.write((2*k-1)+"\n");        		        		
        	}else if(goal <= k*k+k) {        		
        		bw.write((2*k)+"\n");        		        		
        	} else {
        		bw.write((2*k+1)+"\n");        		        		
        	}
        	
        }
        bw.flush();
        bw.close();
    }


}
