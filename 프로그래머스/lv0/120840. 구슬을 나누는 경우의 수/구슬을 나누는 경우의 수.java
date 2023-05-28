class Solution {
    public int solution(int balls, int share) {
        double answer = 1; 
        int n = (balls/2 < share) ? share : balls-share;
        int m = balls - n;
        if(balls != share){
            for(int i = balls; i> n; i--){ answer *= i; }
            for(int j = m; j>1; j--){ answer /= j; }
        }
        return (int) answer;
    }
}