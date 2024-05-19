import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Deque <Integer> cards = new LinkedList<>();
        //카드세팅
        for(int i=1; i<=n; i++) {
        	cards.add(i);
        }
        
        while(cards.size()>1) {
        	cards.pollFirst();
        	int up = cards.pollFirst();
        	cards.addLast(up);
        }
        System.out.println(cards.poll()); 	
       
        
    }
}
