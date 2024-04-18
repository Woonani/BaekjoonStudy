import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<= t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double x1 = Double.parseDouble(st.nextToken());
        	double y1 = Double.parseDouble(st.nextToken());
        	double r1 = Double.parseDouble(st.nextToken());
        	double x2 = Double.parseDouble(st.nextToken());
        	double y2 = Double.parseDouble(st.nextToken());
        	double r2 = Double.parseDouble(st.nextToken());
        	
        	double d = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        	if(d==0) {
        		if(r1==r2) {
        			bw.write(-1+"\n");
        		}else if(r1 == 0&&r2==0) {
        			bw.write(1+"\n");
        		}else {
        			bw.write(0+"\n");
        		}
        	}else {
        		double lo = (r1+r2)*(r1+r2);
        		double li = (r1-r2)*(r1-r2);
        		if(d>li&&d<lo) {
        			bw.write(2+"\n");
        		} else if(d == li||d==lo) {
        			bw.write(1+"\n");
        		} else {
        			bw.write(0+"\n");
        		}        		
        	}
        }
        bw.flush();
        bw.close();
    }
}