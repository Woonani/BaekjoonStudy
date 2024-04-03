import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int [][]arrA = new int[n][m];
        int [][]arrB = new int[n][m];
        
        for(int i = 0; i<n; i++) {
        	StringTokenizer st2 = new StringTokenizer(br.readLine());
        	for(int j = 0; j <m; j++) {
        		arrA[i][j] = Integer.parseInt(st2.nextToken());
        	}
        }
        
        for(int i = 0; i<n; i++) {
        	StringTokenizer st3 = new StringTokenizer(br.readLine());
        	for(int j = 0; j <m; j++) {
        		arrB[i][j] = Integer.parseInt(st3.nextToken());
        	}
        }
        
        for(int i = 0; i<n; i++) {
        	for(int j = 0; j <m; j++) {
        		int x = arrA[i][j] + arrB[i][j];
        		bw.write(x+" ");
        	}
        	bw.write("\n");
        }
        bw.flush();
        bw.close();
        
    }
}