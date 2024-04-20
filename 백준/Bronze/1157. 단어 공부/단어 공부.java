import java.io.*;
import java.util.*;

class Main {
	static int[][] array = new int[10][10];
	static int[] answer = new int[10];
	static int m = -1;
	public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().split("");
        Map<String,Integer> book = new HashMap<>();
        List<String> index = new ArrayList<>();
        int max = -1;
        int next = -1;
        String maxV = "";
        
        for(String word : words) {
        	String n = word.toUpperCase();
        	if(book.containsKey(n)) {
        		book.put(n, book.get(n)+1);
        	}else {
        		book.put(n, 1);
        		index.add(n);
        	}
        }

        for(String s : index) {
        	if(max < book.get(s)) {
        		max = book.get(s);
        		maxV = s;
        	}else if(max == book.get(s)) {
        		next = book.get(s);
        	}
        }

        if(max!=next) {
        	System.out.println(maxV);
        } else {
        	System.out.println("?");
        }
    }
}