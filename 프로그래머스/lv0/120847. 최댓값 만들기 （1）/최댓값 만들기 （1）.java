class Solution {
    public int solution(int[] numbers) {
        int[] answer = new int[2];
        if(numbers[0] >= numbers[1]){
            answer[0] = numbers[0];
            answer[1] = numbers[1];
        }else{
            answer[0] = numbers[1];
            answer[1] = numbers[0];
        };        
        
        for(int i = 2; i<numbers.length; i++){
            if(numbers[i] >= answer[0]){
                answer[1] = answer[0];
                answer[0] = numbers[i];
            }else {
                if(numbers[i] >= answer[1]){
                    answer[1] = numbers[i];
                }
            }
        };
        
        return answer[0]*answer[1];
    }
}