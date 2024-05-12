import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
    	
    	for(int i= 0; i<n; i++) {
    		a[i] = Integer.parseInt(st1.nextToken());
    		b[i] = Integer.parseInt(st2.nextToken());
    	}
    	
    	// a 정렬
    	for(int i=0; i<n-1; i++) {
    		for(int j= i+1; j<=n-1; j++) {
	    		if(a[i]<a[j]) {
	    			continue;
	    		}else {
	    			int temp = a[i];
	    			a[i] = a[j];
	    			a[j] = temp;
	    		}
    		}
    	}

    	// b 정렬
    	for(int i=0; i<n-1; i++) {
    		for(int j= i+1; j<=n-1; j++) {
	    		if(b[i]>b[j]) {
	    			continue;
	    		}else {
	    			int temp = b[i];
	    			b[i] = b[j];
	    			b[j] = temp;
	    		}
    		}
    	}

    	// 곱
    	int answer = 0;
    	for(int i = 0; i<n; i++) {
    		answer += a[i]*b[i];
    	}
    	System.out.println(answer);
    }
}