class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i< emergency.length; i++){
            int patient = 1;
            for(int j = 0; j<emergency.length; j++){                
                if(j == i){ continue; }
                if(emergency[i] < emergency[j]){ patient++; }
            }    
            answer[i] = patient;    
        }
        return answer;
    }
}