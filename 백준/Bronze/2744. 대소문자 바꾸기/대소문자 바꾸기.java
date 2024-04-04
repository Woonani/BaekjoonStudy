import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] text = br.readLine().split("");
        String answer="";
        for(String t : text) {
        	if(t == t.toLowerCase()) {
        		answer += t.toUpperCase();
        	}else {
        		answer += t.toLowerCase();
        	}
        }
        bw.write(answer);
        bw.flush();
        bw.close();
        
    }
}