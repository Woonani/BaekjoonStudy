class Solution {
    public String solution(int age) { // 0 + 97 = a
        String answer = "";
        while(age > 0){
            
            char temp = (char) ((int) (age%10) + 97);
            age = age/10;
            answer = temp + answer;
        }
        return answer;
    }
}