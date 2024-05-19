import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i= 1; i<=t; i++) {
        	String answer = "YES";
        	//List 자료구조로 변환
        	String[] paper = br.readLine().split("");
        	List<Integer> pArr = new ArrayList<Integer>();
        	
        	for(String p : paper) {
        		pArr.add(Integer.parseInt(p));
        	}
        	
        	// 종이접기 검사
        	int ref = 0;
        	while(pArr.size()>0&&answer.equals("YES")) { 
        		int start = pArr.size()-1;
	        	for(int j=start; j>=0;j-=2) {
	        		if(j==start) {
	        			ref = pArr.get(j);
	        		}else {
	        			if(ref != pArr.get(j)) {
	        				ref = pArr.get(j);
	        			}else {
	        				answer = "NO";
	        				break;
	        			}
	        		}
	        		pArr.remove(j);
	        	}
        	}
        	bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();
        
    }
}
