class Solution {
    public int solution(int[] array) {
        int answer=0; int max = 0; int checker = 0;
        
        if(array.length == 1){ return answer = array[0]; } 
        
        int[] counter = new int[1000];

        for(int a : array){
            counter[a] += 1;
        }
        for(int i = 0; i<1000;i++){
            if(counter[i] == 0 || max > counter[i]){
                continue;
            }else if( max < counter[i]){
                max = counter[i];
                answer = i;
            }else{
                checker = max;
                max = counter[i];
            }
        }
        
        return answer = (max == checker) ? -1 : answer;
    }
}