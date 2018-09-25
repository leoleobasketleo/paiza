import java.util.*;

public class paizaD008 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(0 <= N || N <=100){
            if(N % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}