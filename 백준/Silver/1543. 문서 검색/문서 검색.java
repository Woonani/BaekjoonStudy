import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] doc = br.readLine().split("");
        String[] word = br.readLine().split("");
        int count = 0;
        int l = word.length;
        for(int i = 0; i< doc.length-l+1; i++) {
        	for(int j = 0; j<l; j++) {
        		if(!doc[i+j].equals(word[j])) {
        			break;
        		}
        		if(j==l-1) {
        			count++;
        			i = i+j;
        		}
        	}
        }
        System.out.println(count);
    }
}