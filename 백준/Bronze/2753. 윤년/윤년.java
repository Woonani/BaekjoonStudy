import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int result = (year%4 == 0)&&(year%100 != 0)||(year%400 == 0)  ? 1 : 0;
        System.out.println(result);
    }
}