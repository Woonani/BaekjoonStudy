class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 1;
        int r = 0;
        int c = 0;
        int length = n;
        for(int i=1; i<= 2*n-1; i++){
            if(i%2 == 0){
                length--;
            }
            if(i%4 == 1){
                for(int j=1; j<=length; j++){
                    answer[r][c++] = x++; // 우 
                }
                r++; 
                c--;
            }else if(i%4 == 2){
                for(int j=1; j<=length; j++){
                    answer[r++][c] = x++; // 하 
                }
                r--; 
                c--;

            }else if(i%4 ==3){
                for(int j=1; j<=length; j++){
                    answer[r][c--] = x++; // 좌 
                }
                r--; 
                c++; 
            }else {
                for(int j=1; j<=length; j++){
                    answer[r--][c] = x++; // 상 
                }
                r++; 
                c++;
            }                
            
        }
        return answer;
    }
}
