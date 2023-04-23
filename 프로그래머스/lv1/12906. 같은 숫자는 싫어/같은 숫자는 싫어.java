import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        int index = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                ans[index++] = arr[i];
            }
        }
        int[] answer = new int[index];
        for(int i=0; i<index; i++){
            answer[i] = ans[i];
        }

        return answer;
    }
}