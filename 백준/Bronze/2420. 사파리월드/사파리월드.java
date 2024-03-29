import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long answer;
        if(a>=b){
            answer = (long) a - (long) b;
        }else{
            answer = (long) b - (long) a;
        }
        System.out.println(answer);

    }
}