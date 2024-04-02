import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int n = Integer.parseInt(br.readLine());
    	int[] arr = new int[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i =0; i<n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	int v = Integer.parseInt(br.readLine());
    	int answer=0; 
    	for(int x : arr) {
    		if(x==v) {
    			answer++;
    		}
    	}
    	bw.write(answer+"\n");
    	bw.flush();
    	bw.close();
    }
}