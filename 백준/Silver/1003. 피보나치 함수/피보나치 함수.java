import java.io.*;
import java.util.*;

class Main {
	public static Map<Integer,Integer> dp = new HashMap<>();

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        dp.put(0, 0);
        for(int i = 1; i<= t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	if(n==0) {
        		bw.write("1 0\n");        		        		
        	} else {
        		fibonacci(n);
        		bw.write(dp.get(n-1)+" "+dp.get(n)+"\n");        		
        	}
        }
        bw.flush();
        bw.close();
    }

    public static int fibonacci(int n) {
    	if(dp.get(n) != null) {
    		return dp.get(n);
    	}else {    		
	    	if( n == 0) {
	    		dp.put(0, 0);
	    		return 0;
	    	}else if(n == 1) {
	    		dp.put(1, 1);
	    		return 1;
	    	}else {
	    		dp.put(n, fibonacci(n-1)+fibonacci(n-2));
	    		return fibonacci(n-1)+fibonacci(n-2);
	    	}
    	}
    }
}
