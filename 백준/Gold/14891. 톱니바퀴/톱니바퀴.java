import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //gear 변수 셋팅
        String[][] total = new String[4][8];
        total[0] = br.readLine().split("");
        total[1] = br.readLine().split("");
        total[2] = br.readLine().split("");
        total[3] = br.readLine().split("");

        int t = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 1; i<=t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int gear = Integer.parseInt(st.nextToken());
        	int d = Integer.parseInt(st.nextToken());
        	// 톱니관계 a,b,c
        	boolean a = !total[0][2].equals(total[1][6]); // 톱니 1과 2 사이
        	boolean b = !total[1][2].equals(total[2][6]); // 톱니 2와 3 사이
        	boolean c = !total[2][2].equals(total[3][6]); // 톱니 3과 4 사이
        	
        	// gear 회전
			total = rotate(d, gear, total);
			
			if(gear == 1) {
				if(a) {
					total = rotate(d*(-1), 2, total);
					if(b) {
						total = rotate(d, 3, total);
						if(c) {
							total = rotate(d*(-1), 4, total);
						}
					}
				}
			}else if(gear == 2) {
				if(a) {
					total = rotate(d*(-1), 1, total);
				}
				if(b) {
					total = rotate(d*(-1), 3, total);
					if(c) {
						total = rotate(d, 4, total);
					}
				}
				
			}else if(gear == 3) {
				if(b) {
					total = rotate(d*(-1), 2, total);
					if(a) {
						total = rotate(d, 1, total);
					}
				}
				if(c) {
					total = rotate(d*(-1), 4, total);
				}
			}else if(gear == 4) {
				if(c) {
					total = rotate(d*(-1), 3, total);
					if(b) {
						total = rotate(d, 2, total);
						if(a) {
							total = rotate(d*(-1), 1, total);
						}
					}
				}
			}
        }
        // 점수계산
        answer += total[0][0].equals("1") ? 1 : 0;
        answer += total[1][0].equals("1") ? 2 : 0;
        answer += total[2][0].equals("1") ? 4 : 0;
        answer += total[3][0].equals("1") ? 8 : 0;
        System.out.println(answer);
    }
	// 회전함수
	public static String[][] rotate(int d, int gear, String[][] total) {
		if(d>0) {	 // 시계방향	
			String end = total[gear-1][7];
			for(int i= 6; i>=0; i--) {
				total[gear-1][i+1] = total[gear-1][i];
			}
			total[gear-1][0] = end;
		}else if(d<0){	// 반시계방향
			String str = total[gear-1][0];
			for(int i= 1; i<8; i++) {
				total[gear-1][i-1] = total[gear-1][i];
			}
			total[gear-1][7] = str;
		}
		return total;
	}
}

