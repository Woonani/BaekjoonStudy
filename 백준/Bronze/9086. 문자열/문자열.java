import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t= Integer.parseInt(br.readLine());
        
        for(int i=1; i<=t; i++) {
        	String input = br.readLine();
        	int l = input.length();
        	if(l==1) {
        		bw.write(input+input+"\n");        		        		
        	}else if(l ==2) {
        		bw.write(input+"\n");        		
        	}else {        		
        		bw.write(""+input.charAt(0)+input.charAt(l-1)+"\n");        		
        	}
        }
        
        bw.flush();
        bw.close();
        
    }
}