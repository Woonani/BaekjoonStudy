import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i<=t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int result = 1;
        	
        	for(int j =1; j<=b; j++) {
        		result = (result*a)%10;
        	}
        	result = result == 0? 10:result;
        	bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }
}