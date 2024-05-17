import java.io.*;
import java.util.*;

class Main {	
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        Map<Integer,List<Integer>> hanoi = new HashMap<Integer,List<Integer>>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        // 하노이탑 옮기는 수 구하기
        for(int i= 1; i<=n; i++) {
        	if(i==1) {
        		hanoi.put(i, arr);
        	}else {
        		List<Integer> temp = hanoi.get(i-1);
        		hanoi.put(i, hanoiArr(temp));
        	}
        	
        }
        // f(n) = f(n-1)' 1 3 f(n-1)''
        // 첫번째 변환은 2>3이 되고, 3>2가 됨
        // 두번째 변환은 1>2가 되고, 2>1이 됨
        List<Integer> answer = hanoi.get(n);
        int m = answer.size();
        bw.write(m/2+"\n");
        for(int i=0; i<m; i+=2) {
        	
        	bw.write(answer.get(i)+" "+answer.get(i+1)+"\n");
        }
        bw.flush();
        bw.close();
    	
    }
	
	public static List<Integer> hanoiArr(List<Integer> arr){
		List<Integer> arr2 = new ArrayList<Integer>();
		for(int j : arr) {
			int n = j;
			switch(j) {
			case 2:
				n = 3;
				break;
			case 3:
				n = 2;
				break;
			}
			arr2.add(n);
		}
		arr2.add(1);
		arr2.add(3);
		for(int j : arr) {
			int n = j;
			switch(j) {
			case 1:
				n = 2;
				break;
			case 2:
				n = 1;
				break;
			}
			arr2.add(n);
		}
		
		return arr2;
	}
}