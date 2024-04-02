import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int[] students = new int[30];
    	for(int i=1; i<=28; i++) {
    		int inputNum = Integer.parseInt(br.readLine());
    		students[inputNum-1] = inputNum;
    	}
    	
    	
    	int count = 0;
    	for(int i=0; i<30; i++) {
    		if(students[i]==0) {
    			bw.write(i+1+"\n");
    			count++;
    			
    		}
    		if(count ==2) {break;}
    	}
    	
    	bw.flush();
    	bw.close();
    }
}