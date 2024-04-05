import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int numOfTwo = 0;
        int numOfFive = 0;
        Main main = new Main();
        long nValue =1;
        for(int i = n; i> 0; i--) {
        	int check = i;
        	
        	while(check%2 == 0) {
        		numOfTwo++;
        		check = main.countTwo(check);
        	}

        	while(check%5 == 0) {
        		numOfFive++;
        		check = main.countFive(check);
        	}
        }
        
        bw.write(numOfFive+"\n");     		
//        bw.write("2 : "+numOfTwo+" 5: "+numOfFive+"\n");     		
        bw.flush();
        bw.close();
    }
    public int countTwo(int n) {
    	n/=2;
    	return n;
    }
    public int countFive(int n) {
    	n/=5;
    	return n;
    }
    
}