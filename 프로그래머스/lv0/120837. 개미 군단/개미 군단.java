class Solution {
    public int solution(int hp) {
        int answer = 0;
        do{
            if(hp >= 5){
                hp -= 5;
                answer++;
            }else if(hp >=3){
                hp -= 3;
                answer++;
            }else if(hp>=1){
                hp -=1;
                answer++;
            }
        }while(hp>0);
        return answer;
    }
}