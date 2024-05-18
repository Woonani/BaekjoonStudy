import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int change = 1000 - money;
        int count = 0;
        int[] list = {500,100,50,10,5,1};
        
        for(int l : list) {
        	if(change == 0) {
        		break;
        	}else if( change < l) {
        		continue;
        	}
        	int num = change/l;
        	count += num;
        	change %= l;
        }
    	System.out.println(count);
    }
}