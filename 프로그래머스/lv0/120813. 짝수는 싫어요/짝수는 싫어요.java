class Solution {
    public int[] solution(int n) {
        int l = (n%2 == 0) ? n/2:(n/2+1);
        int[] answer = new int [l]; int index = 0;
        for(int i = 1; i<=n; i+=2){ answer[index++] = i; }
        return answer;
    }
}