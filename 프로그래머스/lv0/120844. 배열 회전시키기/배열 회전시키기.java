class Solution {
    public int[] solution(int[] numbers, String direction) {
        int l = numbers.length;
        int[] answer = new int[l];
        
        if(direction.equals("right")){            
            answer[0] = numbers[l-1];
            for(int i = 0; i<l-1; i++){
                answer[i+1] = numbers[i];
            }
        }else{
            for(int j = 1; j<l; j++){
                answer[j-1] = numbers[j];
            }
            answer[l-1] = numbers[0];
        }
        return answer;
    }
}