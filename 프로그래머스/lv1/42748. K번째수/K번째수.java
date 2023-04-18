import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            for(int k = 0; k< temp.length; k++){ // temp정렬
                for(int l = k+1; l<temp.length; l++){
                    if(temp[l] < temp[k]){
                        int t = temp[k]; 
                        temp[k] = temp[l];
                        temp[l] = t;
                    }
                }
            }
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}