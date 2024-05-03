import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i<=t; i++) {
        	int ret = 0;
        	String answer = "YES";
        	String[] ps = br.readLine().split("");
        	for(String p :ps) {
        		if(p.equals("(")) {
        			ret+=1;
        		}else if(p.equals(")")){
        			ret-=1;
        		}
        		if(ret<0) {
        			answer = "NO";
        			break;
        		}
        	}
        	if(ret!=0) {
        		answer = "NO";        		
        	}
        	System.out.println(answer);
        }           
    }
}