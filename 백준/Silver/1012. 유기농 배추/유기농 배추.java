import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i<=t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int m = Integer.parseInt(st.nextToken());
        	int n = Integer.parseInt(st.nextToken());
        	int k = Integer.parseInt(st.nextToken());
        	int[][] field = new int[m][n];
        	
        	for(int j= 1; j<=k; j++) {
        		StringTokenizer st2 = new StringTokenizer(br.readLine());
        		int x = Integer.parseInt(st2.nextToken());
        		int y = Integer.parseInt(st2.nextToken());
        		field[x][y] = 1;        		
        	}
        	
        	int worm = 0;
        	//---------------------------------------------------------------셋팅
        	// field 탐색 반복문
        	for(int mm=0; mm<m; mm++) {
        		for(int nn=0; nn<n; nn++) {
        			// 탐색 함수 실행
        			if(field[mm][nn] == 1) {
        				worm++;
        				field = search(mm,nn,field);
        			}
        		}
        	}
        	bw.write(worm+"\n");
        }
        bw.flush();
        bw.close();
    }
	
	public static int[][] search(int mm, int nn, int[][] field) {
		if(field[mm][nn] == 1) {
			field[mm][nn] = 0;
			if(mm-1>=0) {field = search(mm-1,nn, field);}
			if(nn-1>=0) {field = search(mm,nn-1, field);}
			if(mm+1<field.length) {field = search(mm+1,nn, field);}
			if(nn+1<field[0].length) {field = search(mm,nn+1, field);}
		}
		return field;
	}
}