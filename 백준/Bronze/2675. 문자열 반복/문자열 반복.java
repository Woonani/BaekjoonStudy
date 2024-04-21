import java.io.*;
import java.util.*;

class Main {
	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
//        System.out.print("\n");
        for(int i = 1; i<= t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken());
        	String words = st.nextToken();
        	String[] arr = words.split("");
        	for(int j= 0; j<arr.length; j++) {
        		for(int k= 1; k<=n; k++) {
        			System.out.print(arr[j]);
        		}
        	}
        	System.out.println();
        }
    }
}