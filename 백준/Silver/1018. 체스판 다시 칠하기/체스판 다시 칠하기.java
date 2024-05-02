import java.io.*;
import java.util.*;

class Main {
	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        String[][] chess = new String[h][w];
        
        for(int k = 1; k<= h; k++) {
			String[] temp = br.readLine().split("");
			for(int l =0; l<w; l++) {
				chess[k-1][l] = temp[l];
			}
        }
        
        int caseW = 0;
        int caseB = 0;
        int min = 65;
        
        for(int i = 0; i<= h-8; i++) {
        	for(int j= 0; j<=w-8; j++) {
        		int ii = 0;
        		int jj = 0;
        		while(true) {
        			if(jj == 8) {
        				ii+= 2;
        				if(ii == 8) {
        					break;
        				}
        				jj = 0;
        			}
        			//caseW 탐색
        				if(!chess[i+ii][j+jj].equals("W")) {caseW++;}        				
        				if(!chess[i+ii][j+jj+1].equals("B")) {caseW++;}        				
        				if(!chess[i+ii+1][j+jj].equals("B")) {caseW++;}        				
        				if(!chess[i+ii+1][j+jj+1].equals("W")) {caseW++;}
        			//caseB 탐색
        				if(!chess[i+ii][j+jj].equals("B")) {caseB++;}
        				if(!chess[i+ii][j+jj+1].equals("W")) {caseB++;}
        				if(!chess[i+ii+1][j+jj].equals("W")) {caseB++;}
        				if(!chess[i+ii+1][j+jj+1].equals("B")) {caseB++;}
        			jj+=2;
        		}
        		int tempMin = (caseW < caseB ? caseW : caseB);
        		min = tempMin < min ? tempMin : min;
        		caseW = 0;
        		caseB = 0;
        	}
        }
        min = min == 65 ? 0 : min;
        System.out.println(min);
    }
}