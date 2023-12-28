class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num] ;
        int strt = num%2== 1 ? (total/num - num/2) : (strt = total/num - num/2+1);
        for(int i = 0; i<num; i++){
                answer[i] = strt + i;
         }
        return answer;
    }
}
