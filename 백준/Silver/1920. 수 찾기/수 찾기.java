import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> rangeN = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i<= n; i++ ) {
        	rangeN.put(Integer.parseInt(st.nextToken()), 0);
        }
    
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i=1;i<=m;i++) {
        	int check = Integer.parseInt(st2.nextToken());
        	if(rangeN.containsKey(check)) {
        		bw.write("1"+"\n");
        	}else {
        		bw.write("0"+"\n");
        	}
        }
        bw.flush();
        bw.close();
    }
}
