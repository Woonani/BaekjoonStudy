class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        for(int i = 0; i<code.length(); i++){
            System.out.println(code.charAt(i));
            char letter = code.charAt(i);
            if(letter == '1'){
                mode = !mode;
                continue;
            }
            if(mode){ // mode가 1일 때
                if(i%2 == 1){
                    ret = ret + letter;
                }
            }else{ // mode가 0일 때
                if(i%2 == 0){
                    ret = ret + letter;
                }
            }

            }
        return ret.length() == 0 ? "EMPTY" : ret;
    }
}