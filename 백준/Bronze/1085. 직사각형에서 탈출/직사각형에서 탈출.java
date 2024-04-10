import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int answerX = (x > (w-x)) ? (w-x) : x;
        int answerY = (y > (h-y)) ? (h-y) : y;
        System.out.println(answerX > answerY ? answerY:answerX);
        
    }


}