import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<= t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x1 = Integer.parseInt(st.nextToken());
        	int y1 = Integer.parseInt(st.nextToken());
        	int x2 = Integer.parseInt(st.nextToken());
        	int y2 = Integer.parseInt(st.nextToken());
        	
        	int n = Integer.parseInt(br.readLine());
        	int count = 0;
        	
        	for(int j = 1; j<= n; j++) {
        		StringTokenizer st2 = new StringTokenizer(br.readLine());
        		int cx = Integer.parseInt(st2.nextToken());
        		int cy = Integer.parseInt(st2.nextToken());
        		int r = Integer.parseInt(st2.nextToken());
        		
        		// 출발점 또는 도착점이 원 내부에 있으면 count ++
        		int l1 = (x1-cx)*(x1-cx) + (y1-cy)*(y1-cy);
        		int l2 = (x2-cx)*(x2-cx) + (y2-cy)*(y2-cy);
        		if((l1 > r*r && l2 <r*r)||(l1 < r*r && l2 >r*r)) {
        			// 둘 중 하나가 원 안
        			count++;
        		}
        	}
        	bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
    }

}

