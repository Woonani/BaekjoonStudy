import java.io.*;
import java.util.*;

class Main {
	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i<= n; i++) {
        	arr.add(i-1, i);
        }
        String answer = "<";
        int count = 0;
        while(arr.size()>0) {
        	count++;
        	int x = arr.remove(0);
        	if(count == k) {
        		if(arr.size()==0) {
        			answer += x;
        		}else {
        			answer += x+", ";
        		}
        		count = 0;
        	}else {
        		arr.add(arr.size(), x);
        	}
        }
        System.out.println(answer+">");              
    }
}