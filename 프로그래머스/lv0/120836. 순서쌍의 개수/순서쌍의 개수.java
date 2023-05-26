class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 1){return answer=1;}
        else{
          for(int i = 1; i<= n; i++){            
            if(n%i == 0){ answer++; }                
          }        
          return answer;
        }        
    }
}