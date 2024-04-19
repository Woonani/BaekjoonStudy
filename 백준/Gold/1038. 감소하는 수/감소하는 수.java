import java.io.*;
import java.util.*;

class Main {
	static int[][] array = new int[10][10];
	static int[] answer = new int[10];
	static int m = -1;
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<=9; i++) {
        	for(int j = 0; j<=9; j++) {
        		array[i][j] = j;
        	}
        }
       
        long num=0;
        
        if(n>=0 && n<1023) {    
            int k = 1; // 자리수
        	while(m<n) {
        		backTracking(k, 10,n);
        		k++;
        	}

        	for(int j= k-2; j>=0; j--) {
        		num += Math.pow(10, j)*answer[j];
        	}

        }else {
        	num = -1;
        }
        System.out.println(num);
        
    }
	
	public static void backTracking(int k, int max, int n) { 

		if(k-1<0) {
			return;
		}else if (k-1 == 0) {
			for(int i= k-1; i<max; i++) {
				if(m+1>n) {
					break;
				}
				m++;
				answer[k-1] = i;
			}
			return;
		} else if (k-1 > 0) {
			for(int i = k-1; i<max;i++) {
				if(m+1>n) {
                    break;
				}
				answer[k-1] = i;
				backTracking(k-1,i,n);
			}
			return;
		}
	}	
}