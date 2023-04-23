class Solution {
    public int solution(int n) {
        int answer = 0; //6과 n의 최소공배수를 6으로 나눈 것.
        int[] d = {6,3,2,1};// 즉 6과 n의 최대공약수로 n을 나누면 됨.
        for(int i : d){
            if(n%i==0){
                answer = n/i;
                break;
            }
        }
        return answer;
    }
}