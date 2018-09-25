import java.util.*;


public class paizaD006 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        String str1 = "km";
        String str2 = "m";
        String str3 = "cm";

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.nextLine();

        if(line.trim().equals(str1)) {
            N*= 1000*100*10;
            System.out.println(N);
        }else if(line.trim().equals(str2)){
            N*= 100*10;
            System.out.println(N);
        }else if(line.trim().equals(str3)){
            N*= 10;
            System.out.println(N);
        }
    }
}