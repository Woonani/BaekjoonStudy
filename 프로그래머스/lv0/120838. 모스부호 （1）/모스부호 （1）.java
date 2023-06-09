import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        String answer = "";
        
        HashMap<String, String> morse2 = new HashMap<>();
		
		String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
				+ "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
				+ "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
				+ "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
				+ "'-.--':'y','--..':'z'";
		
		String[] mArr1 = morse.split(",");
		
		for(String m1 : mArr1) {
			String[] m2 = m1.split(":",2);
			morse2.put(m2[0].substring(1, m2[0].length()-1), m2[1].substring(1,2));
			System.out.println("k : " + m2[0].substring(1, m2[0].length()-1) + " v : " + m2[1].substring(1,2));
		}
		
		String[] l = letter.split(" ");
		
		for(String ll : l) {
			answer += morse2.get(ll);
		}
        
        return answer;
    }
}