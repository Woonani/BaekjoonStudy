import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        int k = str.length;
        
        for(int i = 1; i<t; i++) {
        	String[] str2 = br.readLine().split("");
        	
        	for(int j= 0; j<k; j++) {
        		if(!str[j].equals(str2[j])) {
        			str[j] = "?";
        		}
        	}
        }
        String answer = String.join("",str);
        System.out.println(answer);
    }
}