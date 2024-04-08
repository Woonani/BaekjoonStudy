import java.io.*;
import java.util.*;
/*
01010101010101010010010010
010
11110
 */
class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String text = br.readLine();
        String bomb = br.readLine();
        int bombLength = bomb.length();
        int idx = 0;
        
        for(int i=0;i<text.length();i++) {
        	sb.append(text.charAt(i));
        	idx= sb.length()-1;

        	if(idx+1>=bombLength) {
        		for(int j = bombLength-1; j>=0; j--) {        			
                	if(sb.charAt(idx) == bomb.charAt(j)) {
        				idx--;
        			}else {
        				break;
        			}
        			if(j== 0) {
        				sb.delete(idx+1,idx+1+bombLength);
        			}
        		}
        	}
        }
        if(sb.length() == 0) {
        	System.out.println("FRULA");
        }else {
        	System.out.println(sb.toString());
        }
    }
    
}
