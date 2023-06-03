class Solution {
    public int solution(int n) {
        int answer = 1;
        int fac = answer;
        while(fac <= n){
            fac *= ++answer;
        }
        return --answer;
    }
}