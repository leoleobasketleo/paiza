import java.util.*;


public class paizaD025 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 10) {
            System.out.println("00" + N);
        }else if( N < 100){
            System.out.println("0" + N);
        }else{
            System.out.println(N);
        }
    }
}