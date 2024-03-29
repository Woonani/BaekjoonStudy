import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine()); // Integer.parseInt(st.nextToken()); 
        int y = Integer.parseInt(br.readLine()); // Integer.parseInt(st.nextToken()); 
        if(x*y > 0){
            if (x>0){
                System.out.println(1)   ; 
            }else {
                System.out.println(3);
            }
        }else if (x*y<0){
            if (x>0){
                System.out.println(4);  
            }else {
                System.out.println(2);
            }
        }
    }
}