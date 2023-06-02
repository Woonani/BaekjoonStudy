class Solution {
    public int solution(int n) {
        int at = 0;
        for(int i = 1; i <= n; i++){ // n이하 자연수 검사
            int d = 0;
            for(int j = 1; j <= i; j++){ // 소수 검사
                if(i%j == 0){  
                    if(++d > 2){
                        ++at;
                        break;
                    }
                }                
            }
        }
        return at;
    }
}