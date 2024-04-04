import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String text = br.readLine();
        double answer;

        char a = text.charAt(0);

        if(a=='A') {
        	answer = 4.0;
        }else if(a=='B') {
        	answer = 3.0;
        }else if(a=='C') {
        	answer = 2.0;
        }else if(a=='D') {
        	answer = 1.0;
        }else {
        	answer = 0.0;
        }

        if(text.length() == 2) {
	        char b = text.charAt(1);
	        
	        if(b=='+') {
	        	answer += 0.3;
	        }else if(b=='-') {
	        	answer -= 0.3;
	        }
        }
        
        bw.write(answer+"\n");
        bw.flush();
        bw.close();
        
    }
}