import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scale = new int[8];
        for(int i = 0; i<8; i++) {
        	scale[i] = Integer.parseInt(st.nextToken());
        }
        
        int a = scale[0];
        String answer = "mixed";
        if (a==1) {
	        for(int i = 1; i<=7; i++) {
	        	if(a+1 == scale[i]) {
	        		a+=1;
	        		answer = "ascending";
	        	}else {
	        		answer = "mixed";
	        		break;
        		}
	        }
        } else if(a==8) {
        	for(int i = 1; i<=7; i++) {
        		if(a-1 == scale[i]) {
	        		a-=1;
	        		answer = "descending";
	        	}else {
	        		answer = "mixed";
	        		break;
        		}
	        }
        } 
        System.out.println(answer);
    }
}